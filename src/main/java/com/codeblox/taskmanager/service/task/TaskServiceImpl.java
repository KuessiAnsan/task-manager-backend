package com.codeblox.taskmanager.service.task;

import com.codeblox.taskmanager.entity.task.Task;
import com.codeblox.taskmanager.repository.task.TaskJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService{

    private TaskJpaRepository taskJpaRepository;

    @Override
    public List<Task> getTasks() {
        return taskJpaRepository.findAll();
    }

    @Override
    public List<Task> createTasks(List<Task> tasks) {
        return taskJpaRepository.saveAll(tasks);
    }
}
