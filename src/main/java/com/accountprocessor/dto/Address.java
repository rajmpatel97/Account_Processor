package com.accountprocessor.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String street;
    private String city;
    private String province_state;
    private String country;

    public Address(String street, String city, String province_state, String country) {
        this.street = street;
        this.city = city;
        this.province_state = province_state;
        this.country = country;
    }

}
