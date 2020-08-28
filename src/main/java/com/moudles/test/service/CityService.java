package com.moudles.test.service;

import com.common.Result;
import com.github.pagehelper.PageInfo;
import com.moudles.test.model.City;
import com.vo.SearchVo;

import java.util.List;

public interface CityService {
    List<City> getCitiesByCountryId(int countryId);

    PageInfo<City> getCitiesBySearchVo(int countryId, SearchVo searchVo);
    PageInfo<City> getCitiesBySearchVo(SearchVo searchVo);

    Result<City> updateCity(City city);

    Result<Object> deleteCity(int cityId);

    Result<City> insertCity(City city);
}
