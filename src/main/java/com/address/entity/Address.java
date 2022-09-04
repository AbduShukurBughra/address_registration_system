package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(generator = "Address", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Address", sequenceName = "ADDRESS_ID_SEQ", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "ID_STREET", length = 100, nullable = false)
    private Integer idStreet;

    @Column(name = "DOOR_NUMBER", length = 100, nullable = false)
    private Integer doorNumber;

    @Column(name = "APARTMENT_NUMBER", length = 100, nullable = false)
    private Integer apartmentNumber;
}
