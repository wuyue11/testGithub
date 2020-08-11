package com.moudles.test.dao;

import com.moudles.test.model.City;
import com.moudles.test.model.Country;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityDao {
    @Select("select * from m_city where country_id = #{countryId}")
    @Results(id="test1",value = {
            @Result(column = "country_id",property = "country",javaType = Country.class,
                    one = @One(select = "com.moudles.test.dao.CountryDao.getCountryByCountryId2"))
    })
    List<City> getCitiesByCountryId(int countryId);
}
