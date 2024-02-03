package com.jagasa.api;

import com.jagasa.dto.PersonApiDTO;
import com.jagasa.dto.PersonDTO;
import com.jagasa.mapper.PersonApiDTOMapper;
import com.jagasa.service.PersonApi;
import com.jagasa.service.person.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonApiImpl implements PersonApi {

    @Autowired
    private final PersonApiDTOMapper personApiDTOMapper;

    @Autowired
    private final PersonService personService;

    @Override
    public ResponseEntity<PersonApiDTO> createPerson(PersonApiDTO personApiDTO) {
        System.out.println("------------------createPerson------------------");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.personApiDTOMapper.toApiDTO(
                        this.personService.createPerson(this.personApiDTOMapper.toDTO(personApiDTO))));
    }

    @Override
    public ResponseEntity<PersonApiDTO> getPerson(Integer personId) {
        System.out.println("------------------getPerson------------------");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.personApiDTOMapper.toApiDTO(this.personService.getPerson(personId)));
    }

    @Override
    public ResponseEntity<PersonApiDTO> updatePerson(Integer personId, PersonApiDTO personApiDTO) {
        System.out.println("------------------updatePersons------------------");
        final PersonDTO personDTO = this.personApiDTOMapper.toDTO(personApiDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.personApiDTOMapper.toApiDTO(this.personService.updatePerson(personId, personDTO)));
    }

    @Override
    public ResponseEntity<Void> deletePerson(Integer personId) {
        System.out.println("------------------deletePerson------------------");
        this.personService.deletePerson(personId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Override
    public ResponseEntity<List<PersonApiDTO>> listPersons() {
        System.out.println("------------------listPersons------------------");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.personApiDTOMapper.toApiDTOList(this.personService.listPersons()));
    }

}