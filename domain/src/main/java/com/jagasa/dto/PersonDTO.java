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
public class PersonDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer personId;

    private String name;

    private AddressDTO address;

    private Integer phoneNumber;

}
