package com.address.service.entityservice;

import com.address.entity.Address;
import com.address.entity.Country;
import com.address.repository.AddressDao;
import com.address.repository.CountryDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryEntityService {
    private final CountryDao countryDao;
    public void save(Country country) {
        countryDao.save(country);
    }

    public Optional getCountryById(Long id) {
        Optional<Country> country = countryDao.findAllById(id);
        return country;
    }
}
