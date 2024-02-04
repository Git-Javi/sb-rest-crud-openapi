package com.jagasa.api;

import com.jagasa.dto.AddressApiDTO;
import com.jagasa.mapper.AddressApiDTOMapper;
import com.jagasa.service.AddressApi;
import com.jagasa.service.address.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AddressApiImpl implements AddressApi {

    @Autowired
    private final AddressApiDTOMapper addressApiDTOMapper;

    @Autowired
    private final AddressService addressService;


    @Override
    public ResponseEntity<AddressApiDTO> getAddress(Integer addressId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.addressApiDTOMapper.toApiDTO(this.addressService.getAddress(addressId)));
    }

    @Override
    public ResponseEntity<AddressApiDTO> updateAddress(Integer addressId, AddressApiDTO addressDTO) {
        addressDTO.setAddressId(5);
        addressDTO.setStreet("C/ Mentira");
        System.out.println("------------------updateAddresss------------------");
        return ResponseEntity.status(HttpStatus.OK).body((addressDTO));
    }
    
}