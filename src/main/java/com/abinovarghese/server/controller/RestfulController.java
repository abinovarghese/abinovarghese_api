package com.abinovarghese.server.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abinovarghese.server.model.ProjectsModel;
import com.abinovarghese.server.model.StoriesModel;

@RestController
public class RestfulController {
	
	@Autowired
	ProjectsModel projectsModel;
	
	@Autowired
	StoriesModel storiesModel;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/get/projects")
	public ArrayList<Object> getProjects(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
		return projectsModel.getProjects();
	} 
	
	@CrossOrigin(origins = "*")
	@GetMapping("/get/stories")
	public ArrayList<Object> getStories(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
		return storiesModel.getStories();
	}
	
}
