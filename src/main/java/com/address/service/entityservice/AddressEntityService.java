package com.address.service.entityservice;

import com.address.entity.Address;
import com.address.dao.AddressDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressEntityService {
    private final AddressDao addressDao;
    public void save(Address address) {
        addressDao.save(address);
    }

    public List<Address> getAddressById(Long id) {
        List<Address> addressesList = addressDao.findAllById(Collections.singleton(id));
        return addressesList;
    }

    public void delete(Long id) {
        addressDao.deleteById(id);
    }
}
