package com.lauracarpaciu.demo.entity;

import com.lauracarpaciu.demo.util.Constants;

import net.minidev.json.JSONObject;

public class FormatResponse {
	
	public JSONObject formatJSONResponse(Weather weather) {
		
		JSONObject jsonResp = new JSONObject();
			
		jsonResp.put(Constants.JSON_ID, weather.getCityId());
		jsonResp.put(Constants.JSON_NAME, weather.getCityName());
		jsonResp.put(Constants.JSON_WEATHER, weather.getWeather());
		jsonResp.put(Constants.JSON_MAIN_TEMP, weather.getTemp());
		
		return jsonResp;
	}
	
	public String formatWeatherListToString(WeatherDetails weatherDetails) {
		
		String formattedString = "";
		
		formattedString += weatherDetails.getWeatherInstance(0).getWeatherDescription();
		for (int i = 1; i < weatherDetails.getWeatherCount(); i++) {
			formattedString += ", " + weatherDetails.getWeatherInstance(i).getWeatherDescription();
		}
		
		return formattedString;
	}
}