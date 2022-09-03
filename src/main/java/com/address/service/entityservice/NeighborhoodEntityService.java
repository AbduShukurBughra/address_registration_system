package com.address.service.entityservice;

import com.address.entity.Neighborhood;
import com.address.dao.NeighborhoodDao;
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
