package com.address.service.entityservice;

import com.address.entity.Address;
import com.address.entity.District;
import com.address.repository.AddressDao;
import com.address.repository.DistrictDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictEntityService {
    private final DistrictDao districtDao;

    public void save(District district) {
        districtDao.save(district);
    }

    public List<District> getDistrictsByCityId(Integer cityId) {
        List<District> districtList = districtDao.findAllByIdCity(cityId);
        return districtList;
    }
}
