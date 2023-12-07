package com.codeblox.taskmanager.controller.person;

import com.codeblox.taskmanager.entity.person.Person;
import com.codeblox.taskmanager.service.person.PersonService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("/api/people")
public class PersonController {

    private PersonService personService;


    @GetMapping
    public ResponseEntity<List<Person>> getPeople(){
        List<Person> people = personService.getPeople();
        return new ResponseEntity<>(people, OK);
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(Person person){
        Person createdPerson = personService.createPerson(person);
        return new ResponseEntity<>(createdPerson, OK);
    }
}
