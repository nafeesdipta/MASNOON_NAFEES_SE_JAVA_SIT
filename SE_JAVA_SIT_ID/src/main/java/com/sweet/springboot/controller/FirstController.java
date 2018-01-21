package com.sweet.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sweet.springboot.model.Task;
import com.sweet.springboot.service.TaskService;
import com.sweet.springboot.service.TaskService;
@RestController
public class FirstController {
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/hello")
	public String hi(){
		return "Hello World!!! from Rest Controller";
	}
	@GetMapping("/alltasks")
	public String allTasks(){
		return taskService.findAll().toString();
	}

	@GetMapping("/save-task")
	public String saveTask(@RequestParam String ram, @RequestParam String motherboard, @RequestParam String graphicscard){
	Task task =  new Task(ram, motherboard, graphicscard, false);
	taskService.save(task);	
	return "Task saved!";
	}
	
	@GetMapping("/delete-task")
	public String saveTask(@RequestParam int id){
		taskService.delete(id);
		return "Task deleted!";
	}
}
