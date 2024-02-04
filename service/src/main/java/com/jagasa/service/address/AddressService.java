package com.jagasa.service.address;

import com.jagasa.dto.AddressDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;


@Validated
public interface AddressService {

     AddressDTO getAddress(@NotNull Integer addressId);

     AddressDTO updateAddress(@NotNull Integer addressId, @Valid AddressDTO addressDTO) ;

}