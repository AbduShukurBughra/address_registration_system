package com.address.service.entityservice;

import com.address.entity.Address;
import com.address.entity.City;
import com.address.entity.Country;
import com.address.repository.AddressDao;
import com.address.repository.CityDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityEntityService {
    private final CityDao cityDao;
    public void save(City city) {
        cityDao.save(city);
    }

    public Optional getCityByPlate(String plate) {
        Optional<City> city = cityDao.findByPlate(plate);
        return city;
    }
}
