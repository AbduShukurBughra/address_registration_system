package com.address.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_alternative")
@Data
public class AddressAlternative {
    @Id
    @GeneratedValue(generator = "AddressAlternative", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="AddressAlternative", sequenceName = "ADDRESS_ALTERNATIVE_ID_SEQ", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "ID_COUNTRY", length = 100, nullable = false)
    private Integer idCountry;

    @Column(name = "ID_CITY", length = 100, nullable = false)
    private Integer idCity;

    @Column(name = "ID_DISTRICT", length = 100, nullable = false)
    private Integer idDistrict;

    @Column(name = "ID_NEIGHBORHOOD", length = 100, nullable = false)
    private Integer idNeighborhood;

    @Column(name = "ID_STREET", length = 100, nullable = false)
    private Integer idStreet;

    @Column(name = "DOOR_NUMBER", length = 100, nullable = false)
    private Integer doorNumber;

    @Column(name = "APARTMENT_NUMBER", length = 100, nullable = false)
    private Integer apartmentNumber;

}
