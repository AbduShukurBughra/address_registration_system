package com.address.controller;


import com.address.dto.NeighborhoodDto;
import com.address.entity.*;
import com.address.service.entityservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/country/{id}")
    public Optional getCountryById(Long id) {
        Optional country = countryEntityService.getCountryById(id);
        return country;
    }

    //3. Şehir kaydedilebilmelidir.
    @PostMapping("/city")
    public String saveCity(@RequestBody City city) {
        cityEntityService.save(city);
        String cityName = city.getName();
        return cityName + " Adindaki Sehir kaydedildi.";

    }

    //4. Plakadan şehir bilgisi sorgulanabilmelidir.
    @GetMapping("/city/{plate}")
    public Optional getCityByPlate(String plate) {
        Optional city = cityEntityService.getCityByPlate(plate);
        return city;
    }

    //5. İlçe kaydedilebilmelidir.
    @PostMapping("/district")
    public String saveDistrict(@RequestBody District district) {
        districtEntityService.save(district);
        Long districtId = district.getId();
        return " ilce idsi " + districtId + " olan ilce kaydedildi.";
    }

    //6. Bir ile ait ilçeler sorgulanabilmelidir.
    @GetMapping("/district/{city_id}")
    public List<District> getDistrictByCityId(Integer cityId) {
        List<District> districtList = districtEntityService.getDistrictsByCityId(cityId);
        return districtList;
    }

    //7. Mahalle kaydedilebilmelidir.
    @PostMapping("/neighborhood")
    public String saveNeighborhood(@RequestBody Neighborhood neighborhood) {
        neighborhoodEntityService.save(neighborhood);
        String neighborhoodName = neighborhood.getName();
        return neighborhoodName + " Adli Mahelle kaydedildi.";
    }

    //8. Mahalle adını güncellenebilmelidir.
    @PutMapping("/neighborhood/{id}")
    public String updateNeighborhood(@PathVariable Long id, @RequestBody Neighborhood neighborhood){
        neighborhoodEntityService.updateNeighborhood(id, neighborhood);
        return "idsi "+id+" olan malalle adi guncellendi.";
    }
    //9. Bir ilçeye ait mahalleler sorgulanabilmelidir.
   @GetMapping("/neighborhood/{id_district}")
    public List<Neighborhood> getNeighborhoodById(@PathVariable Integer districtId){
        List<Neighborhood> neighborhoodList = neighborhoodEntityService.getNeighborhoodById(districtId);
        return neighborhoodList;
    }


    //10. Sokak kaydedilebilmelidir.
    @PostMapping("/street")
    public String saveStreet(@RequestBody Street street) {
        streetEntityService.save(street);
        String streetName = street.getName();
        return streetName + " Adli Sokak kaydedildi.";
    }

    //11. Sokak adı güncellenebilmelidir.
    @PutMapping("/street/{id}")
    public String updateStreet(@PathVariable Long id, @RequestBody Street street){
        streetEntityService.updateStreet(id, street);
        return "idsi "+id+" olan sokak adi guncellendi.";
    }

    //12. Bir mahalleye ait sokaklar sorgulanabilmelidir.
    @GetMapping("/street/byNeighborhoodId/{id_Neighborhood}")
    public List<Street> getStreetByNId(Integer nId){
        List<Street> streetList = streetEntityService.getStreetByNId(nId);
        return streetList;
    }

    //13. Adres kaydedilebilmelidir.
    @PostMapping("/address")
    public String saveAddress(@RequestBody Address address) {
        addressEntityService.save(address);
        Long addressId = address.getId();
        return " adress idsi " + addressId + " olan adress kaydedildi.";
    }

//14. Adres silinebilmelidir.
    @DeleteMapping("/address/{id}")
    public String deleteAddress(@PathVariable Long id) {
        addressEntityService.delete(id);
        return "address deleted...";
    }



//15. Id den adres bilgisi edinilebilmelidir.
@GetMapping("/address/{id}")
public List<Address> getAddressById(Long id){
    List<Address> addressList = addressEntityService.getAddressById(id);
    return addressList;
}
//DTO example
@PostMapping("/neighborhoodDto")
public String saveNeighborhoodDto(@RequestBody NeighborhoodDto neighborhoodDto) {
    neighborhoodEntityService.saveDto(neighborhoodDto);
    String neighborhoodName = neighborhoodDto.getName();
    return neighborhoodName + " Adli Mahelle kaydedildi.";
}


}


