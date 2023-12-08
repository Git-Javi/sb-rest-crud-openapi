package com.jagasa.service.address;

import com.jagasa.dto.AddressDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;


@Validated
public interface AddressService {

     AddressDTO createAddress(@Valid AddressDTO addressDTO);

     AddressDTO getAddress(@NotNull Integer addressId);

     AddressDTO updateAddress(@NotNull Integer addressId, @Valid AddressDTO addressDTO) ;

     void deleteAddress(@NotNull Integer addressId);

     List<AddressDTO> listAddresses();

}
