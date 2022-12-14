package com.lauracarpaciu.demo.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
@Service
public interface WeatherService {

	JSONObject getWeatherDetailsByCityName(String cityName, String appId);
	JSONArray getWeatherDetailsByCityId(String cityId, String appId);
	
}