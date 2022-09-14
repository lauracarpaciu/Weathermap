package com.lauracarpaciu.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauracarpaciu.demo.entity.Weather;

@Repository
public interface WMRepository extends JpaRepository<Weather, Long> {

}
