package com.address.repository;

import com.address.entity.Address;
import com.address.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictDao extends JpaRepository<District, Long> {

    List<District> findAllByIdCity(Integer cityId);
}
