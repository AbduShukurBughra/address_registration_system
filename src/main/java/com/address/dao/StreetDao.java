package com.address.dao;

import com.address.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetDao extends JpaRepository<Street, Long> {
    List<Street> findAllByIdNeighborhood(Integer neighborhoodId);
}

