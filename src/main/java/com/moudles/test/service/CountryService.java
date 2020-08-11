package com.moudles.test.service;

import com.moudles.test.model.Country;

public interface CountryService {
    Country getCountryByCountryId(int countryId);

    Country getCountryByCountryName(String countryName);
}
