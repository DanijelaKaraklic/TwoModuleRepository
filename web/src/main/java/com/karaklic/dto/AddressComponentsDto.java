package com.karaklic.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressComponentsDto {
    private String postalCode;
    private String country;
    private String city;

    public AddressComponentsDto(String postalCode,String country,String city){
        this.postalCode = postalCode;
        this.country = country;
        this.city = city;
    }
}
