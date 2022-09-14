package com.lauracarpaciu.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lauracarpaciu.demo.service.WeatherService;


@RestController
@RequestMapping("/api")
public class OwmController {
	
private static final Logger Log = LoggerFactory.getLogger(OwmController.class);
	
	@Autowired
	WeatherService weatherService;

	public OwmController(WeatherService weatherService) {
		super();
		this.weatherService = weatherService;
	}
	

    @RequestMapping(value = "/weather/{cityName}&{appId}",method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherDetailsByCityName(@PathVariable("cityName") String cityName, @PathVariable("appId") String appId) throws Exception {
    	Log.info("Fetching weather details with cityName: {}", cityName);
    	 assert cityName != null;
    	 assert appId != null;
    	JSONObject jsonObj = weatherService.getWeatherDetailsByCityName(cityName, appId);
   
        return Optional.ofNullable( weatherService.getWeatherDetailsByCityName(cityName,appId))
                .map(a -> new ResponseEntity<String>(jsonObj.toString(), HttpStatus.OK))
                .orElseThrow(() -> new Exception("No Response from API"));
    }
	
    
    
    @RequestMapping(value = "/group/{cityId}&{appId}",method = RequestMethod.GET)
    public ResponseEntity<?> getGroupWeatherDetailsByCityIDs(@PathVariable("cityId") String cityId, @PathVariable("appId") String appId) throws Exception {
    	Log.info("Fetching weather details with cityId: {}", cityId);
    	
    	JSONArray jsonObj = weatherService.getWeatherDetailsByCityId(cityId, appId);
   
        return Optional.ofNullable(weatherService.getWeatherDetailsByCityId(cityId, appId))
                .map(a -> new ResponseEntity<String>(jsonObj.toString(), HttpStatus.OK))
                .orElseThrow(() -> new Exception("No Response from API"));
    }
	
}

