package com.jagasa.repository.address;

import com.jagasa.dto.AddressDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AddressEntityMapper {

    AddressEntity fromDTO(AddressDTO addressDTO);

    AddressDTO toDTO(AddressEntity addressEntity);

    List<AddressEntity> fromDTOList(List<AddressDTO> addressDTOList);

    List<AddressDTO> toDTOList(List<AddressEntity> addressEntityList);

}
