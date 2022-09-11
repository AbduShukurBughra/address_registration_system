package com.address.dao;

import com.address.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NeighborhoodDao extends JpaRepository<Neighborhood, Long> {


    List<Neighborhood> findAllByIdDistrict(Integer districtId);

    Optional<Neighborhood> findNeighborhoodById(Long id);

}
