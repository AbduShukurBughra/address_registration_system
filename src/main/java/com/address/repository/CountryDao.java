package com.address.repository;

import com.address.entity.Address;
import com.address.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDao extends JpaRepository<Country, String> {
}
