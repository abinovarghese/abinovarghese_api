package com.abinovarghese.server.model;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class ProjectsModel {
	
	@Value("classpath:data/projects/*")
    private Resource[] resources;
	
	public ArrayList<Object> getProjects(){
		ArrayList<Object> list = new ArrayList<Object>();
		try {
			for (final Resource res : resources) {
				JSONParser parser = new JSONParser();
	        	try {
					Object obj = parser.parse(new InputStreamReader(new ClassPathResource("data/projects/"+res.getFilename(), this.getClass().getClassLoader()).getInputStream()));
					list.add(obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
