package com.address.service.entityservice;

import com.address.dto.NeighborhoodDto;
import com.address.entity.District;
import com.address.entity.Neighborhood;
import com.address.dao.NeighborhoodDao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.cdi.CdiRepositoryExtensionSupport;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

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

    public void updateNeighborhood(Long id, Neighborhood neighborhood) {
//      1. id arkilik neighborhood ni tapimiz, buing ismi neighborhoodFromDb
        Optional<Neighborhood> neighborhoodFromDb = neighborhoodDao.findNeighborhoodById(id);

        if (neighborhoodFromDb.isPresent()) {
//      2. neighborhood diki uchurni elip neighborhoodFromDb ning ustige saklaymiz
            Neighborhood neighborhoodNew = new Neighborhood();
            neighborhoodNew.setId(neighborhood.getId());
            neighborhoodNew.setName(neighborhood.getName());
            neighborhoodNew.setIdDistrict(neighborhood.getIdDistrict());
            neighborhoodDao.save(neighborhoodNew);
        }else{
            throw new NotFoundException(" id si"+id+" olan mahalle database ta mevcut degil");
        }
    }

    public void saveDto(NeighborhoodDto neighborhoodDto) {
//        1. object kurimen neighborhood
        Neighborhood neighborhoodNew = new Neighborhood();
//        2. dto dik uchurni yeni kurghan objectke setleymen
        neighborhoodNew.setIdDistrict(neighborhoodDto.getIdDistrict());
        neighborhoodNew.setName(neighborhoodDto.getName());
        neighborhoodNew.setId(null);
//        3. dao ni chakirip save metodini yazimen
        neighborhoodDao.save(neighborhoodNew);
    }
}
