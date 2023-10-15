package com.jagasa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer addressId;

    private String addressPostalCode;

    private String addressStreet;

    private String addressCity;

    private String addressCountry;

}
