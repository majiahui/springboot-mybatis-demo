package com.jh.service;

import com.jh.domain.City;
import com.jh.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public City getCityByState(String state) {
        return cityMapper.findByState(state);
    }
}
