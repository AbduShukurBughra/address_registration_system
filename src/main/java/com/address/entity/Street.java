package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "street")
@Data
public class Street {
    @Id
    @GeneratedValue(generator = "Street", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="Street", sequenceName = "STREET_ID_SEQ", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "ID_NEIGHBORHOOD", length = 100, nullable = false)
    private Integer idNeighborhood;
}
