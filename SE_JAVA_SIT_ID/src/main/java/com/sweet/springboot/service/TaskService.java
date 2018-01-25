package com.sweet.springboot.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sweet.springboot.inter.RamRepo;
import com.sweet.springboot.inter.TaskRepo;
import com.sweet.springboot.model.*;
import com.sweet.springboot.inter.TaskRepo;
@Service
@Transactional
public class TaskService {

	private final TaskRepo taskrepo;
	private final RamRepo ramrepo;
	public TaskService(TaskRepo taskrepo, RamRepo ramrepo) {
		//super();
		this.taskrepo = taskrepo;
		this.ramrepo = ramrepo;
	}
	public List<Task> findAll(){
		List<Task> tasks = new ArrayList<>();
		for(Task task : taskrepo.findAll()){
			tasks.add(task);
		}
			return tasks;
	}
	
	public List<Ram> findram(){
		List<Ram> task2 = new ArrayList<>();
		for(Ram task : ramrepo.findAll()){
			task2.add(task);
		}
			return task2;
	}
	
	public Task findTask(int id){
		return taskrepo.findOne(id);
	}
	
	public void save(Task task){
		taskrepo.save(task);
	}
	
	public void delete(int id){
		taskrepo.delete(id);
	}
}
