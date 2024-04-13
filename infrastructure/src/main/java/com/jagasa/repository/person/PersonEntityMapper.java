package com.jagasa.repository.person;

import com.jagasa.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface PersonEntityMapper {

    PersonEntity fromDTO(PersonDTO personDTO);

    @Mapping(target = "personId", ignore = true)
    @Mapping(target = "address.addressId", ignore = true)
    PersonEntity updateFromDTO(PersonDTO personDTO, @MappingTarget PersonEntity personEntity);

    PersonDTO toDTO(PersonEntity personEntity);

    List<PersonEntity> fromDTOList(List<PersonDTO> personDTOList);

    List<PersonDTO> toDTOList(List<PersonEntity> personEntityList);

}