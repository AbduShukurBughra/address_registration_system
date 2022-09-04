package com.address.service.entityservice;

import com.address.entity.District;
import com.address.entity.Neighborhood;
import com.address.dao.NeighborhoodDao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.cdi.CdiRepositoryExtensionSupport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NeighborhoodEntityService {
    private final NeighborhoodDao neighborhoodDao;

    public void save(Neighborhood neighborhood) {
        neighborhoodDao.save(neighborhood);
    }

    public List<Neighborhood> getNeighborhoodById(Integer districtId) {
        List<Neighborhood> neighborhoodList = neighborhoodDao.findAllByIdDistrict(districtId);
        return neighborhoodList;
    }
}
