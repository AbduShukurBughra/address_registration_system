package com.address.controller;


import com.address.entity.*;
import com.address.service.entityservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class Controller {
    @Autowired
    private AddressEntityService addressEntityService;
    @Autowired
    private CityEntityService cityEntityService;

    @Autowired
    private DistrictEntityService districtEntityService;

    @Autowired
    private NeighborhoodEntityService neighborhoodEntityService;

    @Autowired
    private StreetEntityService streetEntityService;

    @Autowired
    private CountryEntityService countryEntityService;

//1. Ülke kaydedilebilmelidir.
@PostMapping("/country")
public String saveCountry(@RequestBody Country country) {
    countryEntityService.save(country);
    String cityName = country.getName();
    return cityName + " Adindaki Ulke kaydedildi.";

}

//2. Ülke kodundan ülke sorgulanabilmelidir.
//3. Şehir kaydedilebilmelidir.
    @PostMapping("/city")
    public String saveCity(@RequestBody City city) {
        cityEntityService.save(city);
        String cityName = city.getName();
        return cityName + " Adindaki Sehir kaydedildi.";

    }

//4. Plakadan şehir bilgisi sorgulanabilmelidir.
//5. İlçe kaydedilebilmelidir.
    @PostMapping("/district")
    public String saveDistrict(@RequestBody District district) {
        districtEntityService.save(district);
        Long districtId = district.getId();
        return " ilce idsi " + districtId + " olan ilce kaydedildi.";
    }

//6. Bir ile ait ilçeler sorgulanabilmelidir.
//7. Mahalle kaydedilebilmelidir.
    @PostMapping("/neighborhood")
    public String saveNeighborhood(@RequestBody Neighborhood neighborhood) {
        neighborhoodEntityService.save(neighborhood);
        String  neighborhoodName = neighborhood.getName();
        return  neighborhoodName + " Adli Mahelle kaydedildi.";
    }

//8. Mahalle adını güncellenebilmelidir.
//9. Bir ilçeye ait mahalleler sorgulanabilmelidir.
//10. Sokak kaydedilebilmelidir.
    @PostMapping("/street")
    public String saveStreet(@RequestBody Street street) {
        streetEntityService.save(street);
        String  streetName = street.getName();
        return  streetName + " Adli Sokak kaydedildi.";
    }

//11. Sokak adı güncellenebilmelidir.
//12. Bir mahalleye ait sokaklar sorgulanabilmelidir.
//13. Adres kaydedilebilmelidir.
    @PostMapping("/address")
    public String saveAddress(@RequestBody Address address) {
        addressEntityService.save(address);
        Long addressId = address.getId();
        return " adress idsi " + addressId + " olan adress kaydedildi.";
    }

//14. Adres silinebilmelidir.
//15. Id den adres bilgisi edinilebilmelidir.
}


