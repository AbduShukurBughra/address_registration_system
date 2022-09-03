package com.address.dao;


import com.address.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryDao extends JpaRepository<Country, Long> {
    Optional<Country> findAllById(Long id);
}
