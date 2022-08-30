package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "neighborhood")
@Data
public class Neighborhood {
    @Id
    @GeneratedValue(generator = "Neighborhood")
    @SequenceGenerator(name="Neighborhood", sequenceName = "NEIGHBORHOOD_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "ID_DISTRICT", length = 100, nullable = false)
    private Integer id_district;

}
