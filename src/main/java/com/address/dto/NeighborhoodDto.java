package com.address.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class NeighborhoodDto {

    private String name;

    private Integer idDistrict;
}
