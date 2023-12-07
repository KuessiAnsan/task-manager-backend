package com.codeblox.taskmanager.entity.task;

import com.codeblox.taskmanager.entity.BaseEntity;
import com.codeblox.taskmanager.entity.person.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Task extends BaseEntity {

    private String title;

    private String description;

    private Date endingDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @ManyToOne
    private Person person;
}
