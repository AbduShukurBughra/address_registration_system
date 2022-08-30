package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @GeneratedValue(generator = "Country")
    @SequenceGenerator(name="Country", sequenceName = "COUNTRY_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "CODE", length = 100, nullable = false)
    private String code;

}

