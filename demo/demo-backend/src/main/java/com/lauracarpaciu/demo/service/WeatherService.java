package com.lauracarpaciu.demo.service;

import net.minidev.json.JSONArray;

public interface WeatherService {

	JSONObject getWeatherDetailsByCityName(String cityName, String appId);
	JSONArray getWeatherDetailsByCityId(String cityId, String appId);
	
}