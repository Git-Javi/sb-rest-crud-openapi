package com.jagasa.service.address;

import com.jagasa.dto.AddressDTO;
import com.jagasa.exception.JagasaNotFoundException;
import com.jagasa.repository.address.AddressEntityMapper;
import com.jagasa.repository.address.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private final AddressRepository addressRepository;

    @Autowired
    private final AddressEntityMapper addressEntityMapper;

    @Override
    public AddressDTO getAddress(final Integer addressId) {
        return this.addressEntityMapper.toDTO(
                this.addressRepository.findById(addressId).orElseThrow(JagasaNotFoundException::new));
    }

    @Override
    public AddressDTO updateAddress(final Integer addressId, final AddressDTO addressDTO) {
        return null;
    }

}