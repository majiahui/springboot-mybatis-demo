package com.jh.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jh.domain.City;

public class CityServiceTest extends SpringBaseTest {

	@Autowired
	private CityService cityService;

	@Test
	public void test1() {
		City city = cityService.getCityByState("CA");
		System.out.println(city);
	}
}
