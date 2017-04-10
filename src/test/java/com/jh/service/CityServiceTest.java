package com.jh.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jh.Application;
import com.jh.domain.City;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@SpringBootTest(classes = Application.class)
public class CityServiceTest {

	@Autowired
	private CityService cityService;

	@Test
	public void test1() {
		City city = cityService.getCityByState("CA");
		System.out.println(city);
	}
}
