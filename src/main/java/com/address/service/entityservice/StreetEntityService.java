package com.address.service.entityservice;

import com.address.entity.Street;
import com.address.dao.StreetDao;
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
