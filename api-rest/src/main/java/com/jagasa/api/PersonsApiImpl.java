package com.jagasa.api;

import com.jagasa.dto.PersonDTO;
import com.jagasa.service.PersonsApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsApiImpl implements PersonsApi {

/*    @Override
    public ResponseEntity<PersonDTO> getPersonHello() {
        PersonDTO dummy = new PersonDTO();
        dummy.setPersonName("heeeeeeeeeeeelloooo");
        System.out.println("------------------dummyGreeting------------------");
        return ResponseEntity.status(HttpStatus.OK).body(dummy);
    }*/

    @Override
    public ResponseEntity<PersonDTO> getPerson(Integer personId) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setPersonId(personId);
        personDTO.setPersonName("Leo Messi");
        System.out.println("------------------getPerson------------------");
        return ResponseEntity.status(HttpStatus.OK).body(personDTO);
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
