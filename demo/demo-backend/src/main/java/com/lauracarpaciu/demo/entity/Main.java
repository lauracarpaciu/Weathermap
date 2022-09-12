package com.lauracarpaciu.demo.entity;



import com.lauracarpaciu.demo.util.Constants;

import net.minidev.json.JSONObject;

public class Main extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	private final float temp;
	
	Main(){
		super();
		this.temp = Float.NaN;
	}
	
	Main(JSONObject jsonObj) {
		this.temp = (jsonObj != null).optFloat(Constants.JSON_MAIN_TEMP) : Float.NaN;
	}

	public float getTemp() {
		return this.temp;
	}
	
}