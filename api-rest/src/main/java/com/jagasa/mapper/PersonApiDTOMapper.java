package com.jagasa.mapper;

import com.jagasa.dto.PersonApiDTO;
import com.jagasa.dto.PersonDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonApiDTOMapper {

    PersonApiDTO toApiDTO(PersonDTO personDTO);

    List<PersonApiDTO> toApiDTOList(List<PersonDTO> personDTO);
}
