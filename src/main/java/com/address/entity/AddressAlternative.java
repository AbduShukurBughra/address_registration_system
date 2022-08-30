package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_alternative")
@Data
public class AddressAlternative {
    @Id
    @GeneratedValue(generator = "AddressAlternative")
    @SequenceGenerator(name="AddressAlternative", sequenceName = "ADDRESS_ALTERNATIVE_ID_SEQ")
    private Long id;

    @Column(name = "ID_COUNTRY", length = 100, nullable = false)
    private Integer id_country;

    @Column(name = "ID_CITY", length = 100, nullable = false)
    private Integer id_city;

    @Column(name = "ID_DISTRICT", length = 100, nullable = false)
    private Integer id_district;

    @Column(name = "ID_NEIGHBORHOOD", length = 100, nullable = false)
    private Integer id_neighborhood;

    @Column(name = "ID_STREET", length = 100, nullable = false)
    private Integer id_street;

    @Column(name = "DOOR_NUMBER", length = 100, nullable = false)
    private Integer doorNumber;

    @Column(name = "APARTMENT_NUMBER", length = 100, nullable = false)
    private Integer apartmentNumber;

}
