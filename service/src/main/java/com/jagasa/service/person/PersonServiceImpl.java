package com.jagasa.service.person;

import com.jagasa.dto.PersonDTO;
import com.jagasa.exception.JagasaNotFoundException;
import com.jagasa.repository.person.PersonEntityMapper;
import com.jagasa.repository.person.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    @Autowired
    private final PersonRepository personRepository;

    @Autowired
    private final PersonEntityMapper personEntityMapper;

    @Transactional
    @Override
    public PersonDTO createPerson(final PersonDTO personDTO) {
        return this.personEntityMapper.toDTO(
                this.personRepository.save(this.personEntityMapper.fromDTO(personDTO)));
    }

    @Override
    public PersonDTO getPerson(final Integer personId) {
        return this.personEntityMapper.toDTO(
                this.personRepository.findById(personId).orElseThrow(JagasaNotFoundException::new));
    }

    @Transactional
    @Override
    public PersonDTO updatePerson(final Integer personId, final PersonDTO personDTO) {
        this.getPerson(personId);
        return this.personEntityMapper.toDTO(
                this.personRepository.save(this.personEntityMapper.fromDTO(personDTO)));
    }

    @Transactional
    @Override
    public void deletePerson(final Integer personId) {
        this.personRepository.delete(
                this.personEntityMapper.fromDTO(this.getPerson(personId)));
    }

    @Override
    public List<PersonDTO> listPersons() {
       return this.personEntityMapper.toDTOList(
               IterableUtils.toList(this.personRepository.findAll()));
    }

}