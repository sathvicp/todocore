package org.oretachino.todocore.service;

import org.oretachino.todocore.entity.Task;
import org.oretachino.todocore.repos.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskRepoService {

    @Autowired
    private TaskRepository taskRepo;

    public Task createTask(Task newTask) {
        newTask.setCompleted(false);
        taskRepo.save(newTask);
        return newTask;
    }
}
