package com.codeblox.taskmanager.service.person;

import com.codeblox.taskmanager.entity.person.Person;
import com.codeblox.taskmanager.repository.person.PersonJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService{

    private PersonJpaRepository personJpaRepository;

    @Override
    public Person createPerson(Person person) {
        return personJpaRepository.save(person);
    }

    @Override
    public List<Person> getPeople() {
        return personJpaRepository.findAll();
    }
}
