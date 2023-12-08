package com.jagasa.repository.person;

import com.jagasa.dto.PersonDTO;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface PersonEntityMapper {

    PersonEntity fromDTO(PersonDTO personDTO);

    PersonDTO toDTO(PersonEntity personEntity);

    List<PersonEntity> fromDTOList(List<PersonDTO> personDTOList);

    List<PersonDTO> toDTOList(List<PersonEntity> personEntityList);

}
