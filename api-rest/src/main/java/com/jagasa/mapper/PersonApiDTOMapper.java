package com.jagasa.mapper;

import com.jagasa.dto.PersonApiDTO;
import com.jagasa.dto.PersonDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonApiDTOMapper {

    PersonApiDTO toApiDTO(PersonDTO personDTO);

    PersonDTO toDTO(PersonApiDTO personApiDTO);

    List<PersonApiDTO> toApiDTOList(List<PersonDTO> personDTO);

    List<PersonDTO> toDTOList(List<PersonApiDTO> personApiDTOList);

}