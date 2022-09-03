package com.address.service.entityservice;

import com.address.entity.Address;
import com.address.dao.AddressDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressEntityService {
    private final AddressDao addressDao;
    public void save(Address address) {
        addressDao.save(address);
    }
}
