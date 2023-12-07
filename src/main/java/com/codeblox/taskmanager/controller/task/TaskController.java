package com.codeblox.taskmanager.controller.task;

import com.codeblox.taskmanager.entity.task.Task;
import com.codeblox.taskmanager.service.task.TaskService;
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
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getTasks(){
        List<Task> tasks = taskService.getTasks();
        return new ResponseEntity<>(tasks, OK);
    }

    @PostMapping
    public ResponseEntity<List<Task>> createTask(List<Task> tasks){
        List<Task> createdTasks = taskService.createTasks(tasks);
        return new ResponseEntity<>(createdTasks, OK);
    }
}
