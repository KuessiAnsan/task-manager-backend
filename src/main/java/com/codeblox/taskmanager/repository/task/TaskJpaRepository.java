package com.codeblox.taskmanager.repository.task;

import com.codeblox.taskmanager.entity.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskJpaRepository extends JpaRepository<Task, Long> {
}
