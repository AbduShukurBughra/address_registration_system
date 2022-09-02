package com.address.repository;

import com.address.entity.City;
import com.address.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityDao extends JpaRepository<City, Long> {

    Optional<City> findByPlate(String plate);
}
