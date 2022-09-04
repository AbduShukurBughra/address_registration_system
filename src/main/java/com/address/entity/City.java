package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(generator = "City", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="City", sequenceName = "CITY_ID_SEQ", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "PLATE", length = 100, nullable = false)
    private String plate;

    @Column(name = "ID_COUNTRY", length = 100, nullable = false)
    private Integer idCountry;
}
