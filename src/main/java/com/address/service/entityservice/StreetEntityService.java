package com.address.service.entityservice;

import com.address.entity.Street;
import com.address.dao.StreetDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StreetEntityService {
    private final StreetDao streetDao;
    public void save(Street street) {
        streetDao.save(street);
    }

    public List<Street> getStrretById(Integer neighborhoodId) {
        List<Street> streetList = streetDao.findAllByIdNeighborhood(neighborhoodId);
                return streetList;
    }
}
