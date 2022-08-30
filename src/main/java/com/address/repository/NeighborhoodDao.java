package com.address.repository;

import com.address.entity.District;
import com.address.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodDao extends JpaRepository<Neighborhood, String> {
}
