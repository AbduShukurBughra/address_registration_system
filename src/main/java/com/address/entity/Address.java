package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(generator = "Address")
    @SequenceGenerator(name = "Address", sequenceName = "ADDRESS_ID_SEQ")
    private Long id;

    @Column(name = "ID_STREET", length = 100, nullable = false)
    private Integer id_street;

    @Column(name = "DOOR_NUMBER", length = 100, nullable = false)
    private Integer doorNumber;

    @Column(name = "APARTMENT_NUMBER", length = 100, nullable = false)
    private Integer apartmentNumber;
}
