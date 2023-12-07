package com.codeblox.taskmanager.service.person;

import com.codeblox.taskmanager.entity.person.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    Person createPerson(Person person);

    List<Person> getPeople();
}
