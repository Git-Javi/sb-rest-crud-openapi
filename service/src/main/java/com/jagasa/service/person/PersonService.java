package com.jagasa.service.person;

import com.jagasa.dto.PersonDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface PersonService {

     PersonDTO createPerson(@Valid PersonDTO personDTO);

     PersonDTO getPerson(@NotNull Integer personId);

     PersonDTO updatePerson(@NotNull Integer personId, @Valid PersonDTO personDTO) ;

     void deletePerson(@NotNull Integer personId);

     List<PersonDTO> listPersons();

}
