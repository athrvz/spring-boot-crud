package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.TaskService;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.example.demo.models.Task;

@RestController
// @RequestMapping("/api/v1/tasks")
public class TaskController {
  @Autowired
  private TaskService taskService;

  @GetMapping("/")
  public ResponseEntity<List<Task>> getAllTasks() {
    System.out.println("Getting all tasks");
    return ResponseEntity.ok(taskService.getAllTask());
  }

  @GetMapping("/completed")
  public ResponseEntity<List<Task>> getAllCompletedTasks() {
    System.out.println("Getting all completed tasks");
    return ResponseEntity.ok(taskService.findAllCompletedTask());
  }

  @GetMapping("/incomplete")
  public ResponseEntity<List<Task>> getAllInCompleteTasks() {
    System.out.println("Getting all incomplete tasks");
    return ResponseEntity.ok(taskService.findAllInCompleteTask());
  }

  @PostMapping("/")
  public ResponseEntity<Task> createTask(@RequestBody Task task) {
    System.out.println("Creating new Task " + task.getId());
    return ResponseEntity.ok(taskService.createNewTask(task));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Task> updateTask(@PathVariable Long id, Task task) {
    return ResponseEntity.ok(taskService.updateTask(task));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Boolean> getAllTasks(@PathVariable Long id) {
    taskService.deleteTask(id);
    return ResponseEntity.ok(true);
  }
}
