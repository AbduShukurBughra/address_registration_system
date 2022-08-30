package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "district")
@Data
public class District {
    @Id
    @GeneratedValue(generator = "District")
    @SequenceGenerator(name="District", sequenceName = "DISTRICT_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "ID_CITY", length = 100, nullable = false)
    private Integer id_city;

}
