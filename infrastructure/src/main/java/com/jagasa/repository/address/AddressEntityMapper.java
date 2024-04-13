package com.jagasa.repository.address;

import com.jagasa.dto.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface AddressEntityMapper {

    AddressEntity fromDTO(AddressDTO addressDTO);

    @Mapping(target = "addressId", ignore = true)
    AddressEntity updateFromDTO(AddressDTO personDTO, @MappingTarget AddressEntity personEntity);

    AddressDTO toDTO(AddressEntity addressEntity);

    List<AddressEntity> fromDTOList(List<AddressDTO> addressDTOList);

    List<AddressDTO> toDTOList(List<AddressEntity> addressEntityList);

}