package com.address.service.entityservice;

import com.address.entity.Address;
import com.address.entity.City;
import com.address.repository.AddressDao;
import com.address.repository.CityDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityEntityService {
    private final CityDao cityDao;
    public void save(City city) {
        cityDao.save(city);
    }
}
