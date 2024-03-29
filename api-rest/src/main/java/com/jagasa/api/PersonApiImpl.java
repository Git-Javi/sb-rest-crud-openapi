package com.jagasa.api;

import com.jagasa.dto.PersonApiDTO;
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
    public ResponseEntity<PersonApiDTO> updatePerson(Integer personId, PersonApiDTO personDTO) {
        personDTO.setPersonId(5);
        personDTO.setName("Maradona");
        System.out.println("------------------updatePersons------------------");
        return ResponseEntity.status(HttpStatus.OK).body((personDTO));
    }

    @Override
    public ResponseEntity<Void> deletePerson(Integer personId) {
        PersonApiDTO personDTO = new PersonApiDTO();
        personDTO.setPersonId(personId);
        personDTO.setName("Pelé");
        System.out.println("------------------deletePerson------------------");
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Override
    public ResponseEntity<List<PersonApiDTO>> listPersons() {
        PersonApiDTO personDTO = new PersonApiDTO();
        personDTO.setPersonId(7);
        personDTO.setName("Lucas Perez");
        System.out.println("------------------listPersons------------------");
        return ResponseEntity.status(HttpStatus.OK).body(List.of(personDTO));
    }

}
