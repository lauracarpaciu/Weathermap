package com.lauracarpaciu.demo.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.catalina.authenticator.Constants;

import net.minidev.json.JSONObject;

public abstract class AbstractWeather extends AbstractResponse {
	
	private static final long serialVersionUID = 1L;

	private int weatherCount;
	private List<Weather> weatherList;
	
	AbstractWeather(){
		super();
		
		weatherCount = 0;
		weatherList = Collections.emptyList();
	}
	
	AbstractWeather(JSONObject jsonObj) {
		super(jsonObj);
		
		JSONArray weatherArray = (jsonObj != null) ? jsonObj.optJSONArray(Constants.JSON_WEATHER) : new JSONArray();
		this.weatherList = (weatherArray != null) ? new ArrayList<Weather>(weatherArray.length()) : Collections.emptyList();
		
		if (weatherArray != null && this.weatherList != Collections.EMPTY_LIST) {
			for (int i = 0; i < weatherArray.length(); i++) {
				JSONObject weatherObj = weatherArray.optJSONObject(i);
				if (weatherObj != null) {
					this.weatherList.add(new Weather(weatherObj));
				}
			}
		}
		this.weatherCount = this.weatherList.size();
	}
	
	public Weather getWeatherInstance(int index) {
		return this.weatherList.get(index);
	}
	
	public int getWeatherCount() {
		return this.weatherCount;
	}
	
