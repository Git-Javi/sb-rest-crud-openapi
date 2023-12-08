package com.jagasa.api;

import com.jagasa.dto.AddressDTO;
import com.jagasa.service.AddressApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressApiImpl implements AddressApi {

    @Override
    public ResponseEntity<AddressDTO> createAddress(AddressDTO addressDTO) {
        addressDTO.setAddressId(1);
        addressDTO.setAddressStreet("C/ Sin Nombre");
        System.out.println("------------------createAddress------------------");
        return ResponseEntity.status(HttpStatus.OK).body(addressDTO);
    }

    @Override
    public ResponseEntity<AddressDTO> getAddress(Integer addressId) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setAddressId(addressId);
        addressDTO.setAddressStreet("C/ Inventada");
        System.out.println("------------------getAddress------------------");
        return ResponseEntity.status(HttpStatus.OK).body(addressDTO);
    }

    @Override
    public ResponseEntity<AddressDTO> updateAddress(Integer addressId, AddressDTO addressDTO) {
        addressDTO.setAddressId(5);
        addressDTO.setAddressStreet("C/ Mentira");
        System.out.println("------------------updateAddresss------------------");
        return ResponseEntity.status(HttpStatus.OK).body((addressDTO));
    }

    @Override
    public ResponseEntity<Void> deleteAddress(Integer addressId) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setAddressId(addressId);
        addressDTO.setAddressStreet("C/ Olvidada");
        System.out.println("------------------deleteAddress------------------");
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    
}
