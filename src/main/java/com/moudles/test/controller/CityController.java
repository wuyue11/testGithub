package com.moudles.test.controller;

import com.moudles.test.model.City;
import com.moudles.test.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    @Autowired
    CityService cityService;
    @GetMapping("/cities/{countryId}")
    public List<City> getCityByCountryId(@PathVariable int countryId){
        return cityService.getCitiesByCountryId(countryId);
    }

}
