package com.karaklic.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateProductRequest {
    private Integer id;
    private String name;
    private String currency;
    private double longitude;
    private double latitude;
    private String phone;
    private AddressComponentsDto addressComponentsDto;
    private SupplierDto supplierDto;

    public UpdateProductRequest(Integer id, String name, String currency, double longitude, double latitude, String phone, AddressComponentsDto addressComponentsDto, SupplierDto supplierDto) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.addressComponentsDto = addressComponentsDto;
        this.supplierDto = supplierDto;
    }
}
