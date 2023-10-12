package com.jagasa.api;

import com.jagasa.dto.PersonDTO;
import com.jagasa.service.PersonApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonApiImpl implements PersonApi {

    @Override
    public ResponseEntity<PersonDTO> createPerson() {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setPersonId(3);
        personDTO.setPersonName("Cristiano Ronaldo");
        System.out.println("------------------createPerson------------------");
        return ResponseEntity.status(HttpStatus.OK).body(personDTO);
    }

    @Override
    public ResponseEntity<PersonDTO> getPerson(Integer personId) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setPersonId(personId);
        personDTO.setPersonName("Leo Messi");
        System.out.println("------------------getPerson------------------");
        return ResponseEntity.status(HttpStatus.OK).body(personDTO);
    }

    @Override
    public ResponseEntity<PersonDTO> updatePerson(Integer personId, PersonDTO personDTO) {
        personDTO.setPersonId(5);
        personDTO.setPersonName("Maradona");
        System.out.println("------------------updatePersons------------------");
        return ResponseEntity.status(HttpStatus.OK).body((personDTO));
    }

    @Override
    public ResponseEntity<Void> deletePerson(Integer personId) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setPersonId(personId);
        personDTO.setPersonName("Pelé");
        System.out.println("------------------deletePerson------------------");
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Override
    public ResponseEntity<List<PersonDTO>> listPersons() {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setPersonId(7);
        personDTO.setPersonName("Lucas Perez");
        System.out.println("------------------listPersons------------------");
        return ResponseEntity.status(HttpStatus.OK).body(List.of(personDTO));
    }

}
