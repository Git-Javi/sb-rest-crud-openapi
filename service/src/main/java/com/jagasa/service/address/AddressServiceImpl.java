package com.jagasa.service.address;

import com.jagasa.dto.AddressDTO;
import com.jagasa.repository.address.AddressEntityMapper;
import com.jagasa.repository.address.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private final AddressRepository addressRepository;

    @Autowired
    private final AddressEntityMapper addressEntityMapper;


    @Override
    public AddressDTO createAddress(final AddressDTO addressDTO) {
        return this.addressEntityMapper.toDTO
                (this.addressRepository.save(this.addressEntityMapper.fromDTO(addressDTO)));
    }

    @Override
    public AddressDTO getAddress(final Integer addressId) {
        return null;
    }

    @Override
    public AddressDTO updateAddress(final Integer addressId, final AddressDTO addressDTO) {
        return null;
    }

    @Override
    public void deleteAddress(final Integer addressId) {

    }

    @Override
    public List<AddressDTO> listAddresses() {
        return null;
    }

}
