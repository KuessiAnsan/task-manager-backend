package com.codeblox.taskmanager.repository.person;

import com.codeblox.taskmanager.entity.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJpaRepository extends JpaRepository<Person, Long> {
}
