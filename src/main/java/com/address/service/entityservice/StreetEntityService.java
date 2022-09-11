package com.address.service.entityservice;

import com.address.entity.Street;
import com.address.dao.StreetDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreetEntityService {
    private final StreetDao streetDao;
    public void save(Street street) {
        streetDao.save(street);
    }

    public List<Street> getStreetById(Integer streetId) {
        List<Street> streetList = streetDao.findAllByIdStreet(streetId);
                return streetList;
    }

    public void updateStreet(Long id, Street street) {
//      1. id arkilik street ni tapimiz, buing ismi streetFromDb
            Optional<Street> streetFromDb = streetDao.findStreetById(id);

            if (streetFromDb.isPresent()) {
//      2. street diki uchurni elip streetFromDb ning ustige saklaymiz
                Street streetNew = new Street();
                streetNew.setId(street.getId());
                streetNew.setName(street.getName());
                streetDao.save(streetNew);
            }else{
                throw new NotFoundException(" id si"+id+" olan sokak database ta mevcut degil");
            }
        }

}
