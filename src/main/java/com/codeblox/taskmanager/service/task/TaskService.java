package com.codeblox.taskmanager.service.task;

import com.codeblox.taskmanager.entity.task.Task;

import java.util.List;

public interface TaskService {
    List<Task> getTasks();

    List<Task> createTasks(List<Task> tasks);
}
