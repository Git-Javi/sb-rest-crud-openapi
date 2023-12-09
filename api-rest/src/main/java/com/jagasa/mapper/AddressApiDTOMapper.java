package com.jagasa.mapper;

import com.jagasa.dto.AddressApiDTO;
import com.jagasa.dto.AddressDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AddressApiDTOMapper {

    AddressApiDTO toApiDTO(AddressDTO addressDTO);


    AddressDTO toDTO(AddressApiDTO addressApiDTO);

    List<AddressApiDTO> toApiDTOList(List<AddressDTO> addressDTO);

    List<AddressDTO> toDTOList(List<AddressApiDTO> addressApiDTOList);

}
