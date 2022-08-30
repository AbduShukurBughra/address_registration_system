package com.address.service.entityservice;

import com.address.entity.Address;
import com.address.entity.District;
import com.address.repository.AddressDao;
import com.address.repository.DistrictDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DistrictEntityService {
    private final DistrictDao districtDao;

    public void save(District district) {
        districtDao.save(district);
    }
}
