package com.karaklic.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SupplierDto {
    private String name;
    private String emailAddress;
    private String mobilePhone;

    public SupplierDto(String name, String email, String mobile) {
        this.name = name;
        this.emailAddress = email;
        this.mobilePhone = mobile;
    }
}
