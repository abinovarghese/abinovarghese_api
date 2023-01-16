package com.abinovarghese.server.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.abinovarghese.server.view.Project;

public class ProjectsModel {
	
	public static ArrayList<Object> getProjects(){
		ArrayList<Object> list = new ArrayList<Object>();
		
		/*Retrieving data from JSON Files */
		try (Stream<Path> paths = Files.walk(Paths.get(System.getProperty("user.dir")+"/src/main/resources/data/projects"))) {
		    paths
		        .filter(Files::isRegularFile)
		        .forEach(File -> {
		        	JSONParser parser = new JSONParser();
		        	try {
						Object obj = parser.parse(new FileReader(File.toString()));
						JSONObject jsonObject = (JSONObject) obj;
						//System.out.println(jsonObject);
						//Json string has been converted into JSONObject
						
						list.add(obj);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        	
		        });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		return list;
	}

}
