package com.abinovarghese.server.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abinovarghese.server.model.ProjectsModel;
import com.abinovarghese.server.model.StoriesModel;
import com.abinovarghese.server.view.Project;

@RestController
public class RestfulController {
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/get/projects")
	public ArrayList<Object> getProjects(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
	  
		return ProjectsModel.getProjects();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/get/stories")
	public ArrayList<Object> getStories(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
	  
		return StoriesModel.getStories();
	}
	
}
