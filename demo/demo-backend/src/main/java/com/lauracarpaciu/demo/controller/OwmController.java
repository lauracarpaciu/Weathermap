package com.lauracarpaciu.demo.controller;

import java.lang.System.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lauracarpaciu.demo.service.WeatherService;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping("/api")
public class OwmController {
	
	private static final Logger Log = LoggerFactory.getLogger(OwmController.class);
	
	@Autowired
	WeatherService weatherService;

	@GetMapping("/weather/{cityName}&{appId}")
	public ResponseEntity<?> getWeatherDetailsByCityName(
			@PathVariable("cityName") String cityName, @PathVariable("appId") String appId) {
		Log.info("Fetching weather details with cityName: {}", cityName);
		
		JSONObject jsonObj = weatherService.getWeatherDetailsByCityName(cityName, appId);
		if (jsonObj.isEmpty()) {
			ResponseEntity<?> responseEntity = new ResponseEntity<Object>("No Response from API", HttpStatus.NOT_FOUND);
			return responseEntity;
		}
		return new ResponseEntity<String>(jsonObj.toString(), HttpStatus.OK);
	}
	
	@GetMapping("/group/{cityId}&{appId}")
	public ResponseEntity<?> getGroupWeatherDetailsByCityIDs(
			@PathVariable("cityId") String cityId, @PathVariable("appId") String appId) {
		Log.info("Fetching weather details with cityId: {}", cityId);
		
		JSONArray jsonObj = weatherService.getWeatherDetailsByCityId(cityId, appId);
		if (jsonObj.isEmpty()) {
			ResponseEntity<?> responseEntity = new ResponseEntity<Object>("No Response from API", HttpStatus.NOT_FOUND);
			return responseEntity;
		}
		return new ResponseEntity<String>(jsonObj.toString(), HttpStatus.OK);
	}
	
}

