package com.moudles.test.dao;

import com.moudles.test.model.City;
import com.moudles.test.model.Country;
import com.vo.SearchVo;
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

    @Select("select * from m_city where country_id = #{countryId}")
    List<City> getCitiesByCountryId2(int countryId);

    @Select("<script>" +
            "select * from m_city "
            + "<where> "
            + "<if test='keyWord != \"\" and keyWord != null'>"
            + " and (city_name like '%${keyWord}%' or local_city_name like '%${keyWord}%') "
            + "</if>"
            + "</where>"
            + "<choose>"
            + "<when test='orderBy != \"\" and orderBy != null'>"
            + " order by ${orderBy} ${sort}"
            + "</when>"
            + "<otherwise>"
            + " order by city_id desc"
            + "</otherwise>"
            + "</choose>"
            + "</script>")
    List<City> getCitiesBySearchVo(SearchVo searchVo);


    @Insert("insert into m_city (city_name, local_city_name, country_id, date_created) " +
            "values (#{cityName}, #{localCityName}, #{countryId}, #{dateCreated})")
    @Options(useGeneratedKeys = true, keyColumn = "city_id", keyProperty = "cityId")
    void insertCity(City city);

    @Update("update m_city set city_name = #{cityName} where city_id = #{cityId}")
    void updateCity(City city);

    @Delete("delete from m_city where city_id = #{cityId}")
    void deleteCity(int cityId);
}
