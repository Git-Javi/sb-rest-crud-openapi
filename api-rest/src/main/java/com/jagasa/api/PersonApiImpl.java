package com.jagasa.api;

import com.jagasa.dto.PersonApiDTO;
import com.jagasa.dto.PersonDTO;
import com.jagasa.mapper.PersonApiDTOMapper;
import com.jagasa.service.PersonApi;
import com.jagasa.service.person.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PersonApiImpl implements PersonApi {

    @Autowired
    private final PersonApiDTOMapper personApiDTOMapper;

    @Autowired
    private final PersonService personService;

    @Override
    public ResponseEntity<PersonApiDTO> createPerson(PersonApiDTO personApiDTO) {
        log.info("Start :: PersonApi.createPerson(personApiDTO) :: {}", personApiDTO);
        final PersonDTO result = this.personService.createPerson(this.personApiDTOMapper.toDTO(personApiDTO));
        log.info("End :: PersonApi.createPerson(personApiDTO) :: Result :: {}", result);
        return ResponseEntity.status(HttpStatus.OK).body(this.personApiDTOMapper.toApiDTO(result));
    }

    @Override
    public ResponseEntity<PersonApiDTO> getPerson(Integer personId) {
        log.info("Start :: PersonApi.getPerson(personId): {}", personId);
        final PersonDTO result = this.personService.getPerson(personId);
        log.info("End :: PersonApi.getPerson(personId): {}", result);
        return ResponseEntity.status(HttpStatus.OK).body(this.personApiDTOMapper.toApiDTO(result));
    }

    @Override
    public ResponseEntity<PersonApiDTO> updatePerson(Integer personId, PersonApiDTO personApiDTO) {
        log.info("Start :: PersonApi.updatePerson(personId, personApiDTO) :: {} {}", personId, personApiDTO);
        final PersonDTO personDTO = this.personApiDTOMapper.toDTO(personApiDTO);
        final PersonDTO result = this.personService.updatePerson(personId, personDTO);
        log.info("End :: PersonApi.updatePerson(personId, personApiDTO) :: Result :: {}", result);
        return ResponseEntity.status(HttpStatus.OK).body(this.personApiDTOMapper.toApiDTO(result));
    }

    @Override
    public ResponseEntity<Void> deletePerson(Integer personId) {
        log.info("Start :: PersonApi.deletePerson(personId): {}", personId);
        this.personService.deletePerson(personId);
        log.info("End :: PersonApi.deletePerson(personId)");
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Override
    public ResponseEntity<List<PersonApiDTO>> listPersons() {
        log.info("Start :: PersonApi.listPersons()");
        final List<PersonDTO> result = this.personService.listPersons();
        log.info("End :: PersonApi.listPersons() :: Result {}", result);
        return ResponseEntity.status(HttpStatus.OK).body(this.personApiDTOMapper.toApiDTOList(result));
    }

}