package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @GeneratedValue(generator = "Country", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="Country", sequenceName = "COUNTRY_ID_SEQ", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "CODE", length = 100, nullable = false)
    private String code;

}

