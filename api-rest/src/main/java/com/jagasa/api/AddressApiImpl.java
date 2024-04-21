package com.jagasa.api;

import com.jagasa.dto.AddressApiDTO;
import com.jagasa.dto.AddressDTO;
import com.jagasa.mapper.AddressApiDTOMapper;
import com.jagasa.service.AddressApi;
import com.jagasa.service.address.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AddressApiImpl implements AddressApi {

    @Autowired
    private final AddressApiDTOMapper addressApiDTOMapper;

    @Autowired
    private final AddressService addressService;


    @Override
    public ResponseEntity<AddressApiDTO> getAddress(Integer addressId) {
        log.info("Start :: AddressApi.getAddress(addressId) :: {}", addressId);
        final AddressDTO result = this.addressService.getAddress(addressId);
        log.info("End :: AddressApi.getAddress(addressId) :: {}", result);
        return ResponseEntity.status(HttpStatus.OK).body(this.addressApiDTOMapper.toApiDTO(result));
    }

    @Override
    public ResponseEntity<AddressApiDTO> updateAddress(Integer addressId, AddressApiDTO addressApiDTO) {
        log.info("Start :: AddressApi.updateAddress(addressId, addressApiDTO) :: {} {}", addressId, addressApiDTO);
        final AddressDTO addressDTO = this.addressApiDTOMapper.toDTO(addressApiDTO);
        final AddressDTO result = this.addressService.updateAddress(addressId, addressDTO);
        log.info("End :: AddressApi.updateAddress(addressId, addressApiDTO) :: Result :: {}", result);
        return ResponseEntity.status(HttpStatus.OK).body((this.addressApiDTOMapper.toApiDTO(result)));
    }
    
}