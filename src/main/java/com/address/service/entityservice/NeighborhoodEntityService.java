package com.address.service.entityservice;

import com.address.entity.District;
import com.address.entity.Neighborhood;
import com.address.repository.DistrictDao;
import com.address.repository.NeighborhoodDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NeighborhoodEntityService {
    private final NeighborhoodDao neighborhoodDao;

    public void save(Neighborhood neighborhood) {
        neighborhoodDao.save(neighborhood);
    }
}
