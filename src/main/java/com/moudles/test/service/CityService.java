package com.moudles.test.service;

import com.github.pagehelper.PageInfo;
import com.moudles.test.model.City;
import com.vo.SearchVo;

import java.util.List;

public interface CityService {
    List<City> getCitiesByCountryId(int countryId);

    PageInfo<City> getCitiesBySearchVo(int countryId, SearchVo searchVo);
}
