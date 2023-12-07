package com.codeblox.taskmanager.entity.person;

import com.codeblox.taskmanager.entity.BaseEntity;
import com.codeblox.taskmanager.entity.task.Task;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person extends BaseEntity {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    @OneToMany(mappedBy = "person", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Task> tasks;
}
