package com.lauracarpaciu.demo.entity;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;




@Entity
@Table(name="weatherTable")
public class Weather  extends BaseEntity {


	private static final long serialVersionUID = 4010460117921111941L;
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	private long cityId;
	
	private String cityName;
	
	private String weather;
	
	private double temp;

	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weather(Long id, long cityId, String cityName, String weather, double temp) {
		super();
		Id = id;
		this.cityId = cityId;
		this.cityName = cityName;
		this.weather = weather;
		this.temp = temp;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Id, cityId, cityName, temp, weather);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weather other = (Weather) obj;
		return Objects.equals(Id, other.Id) && cityId == other.cityId && Objects.equals(cityName, other.cityName)
				&& Double.doubleToLongBits(temp) == Double.doubleToLongBits(other.temp)
				&& Objects.equals(weather, other.weather);
	}

	@Override
	public String toString() {
		return "Weather [Id=" + Id + ", cityId=" + cityId + ", cityName=" + cityName + ", weather=" + weather
				+ ", temp=" + temp + "]";
	}
	
	
	
		
}
