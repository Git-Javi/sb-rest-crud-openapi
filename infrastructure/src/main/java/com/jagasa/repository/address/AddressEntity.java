package com.jagasa.repository.address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ADDRESS")
public class AddressEntity{

    @Id
    @Column(name = "ADDRESS_ID")
    private Integer addressId;

    @Column(name = "ADDRESS_POSTAL_CODE")
    private String postalCode;

    @Column(name = "ADDRESS_STREET")
    private String street;

    @Column(name = "ADDRESS_CITY")
    private String city;

    @Column(name = "ADDRESS_COUNTRY")
    private String country;

}
