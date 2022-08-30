package com.address.service.entityservice;

import com.address.entity.Address;
import com.address.entity.Street;
import com.address.repository.AddressDao;
import com.address.repository.StreetDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StreetEntityService {
    private final StreetDao streetDao;
    public void save(Street street) {
        streetDao.save(street);
    }
}
