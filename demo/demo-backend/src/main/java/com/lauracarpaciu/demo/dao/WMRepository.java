package com.lauracarpaciu.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lauracarpaciu.demo.entity.Weather;

public interface WMRepository extends JpaRepository<Weather, Long> {

}
