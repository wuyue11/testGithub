package com.moudles.test.service.Impl;

import com.moudles.test.dao.CountryDao;
import com.moudles.test.model.Country;
import com.moudles.test.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryDao countryDao;
    @Override
    public Country getCountryByCountryId(int countryId) {
        return countryDao.getCountryByCountryId(countryId);
    }

    @Override
    public Country getCountryByCountryName(String countryName) {
        return countryDao.getCountryByCountryName(countryName);
    }
}
