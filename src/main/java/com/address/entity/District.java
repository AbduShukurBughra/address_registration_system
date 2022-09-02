package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "district")
@Data
public class District {
    @Id
    @GeneratedValue(generator = "District", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="District", sequenceName = "DISTRICT_ID_SEQ", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "ID_CITY", length = 100, nullable = false)
    private Integer idCity;

}
