package com.bridgelabz.objectorientedprog;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SimpleJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		
		JSONObject jsonObject = new JSONObject();
//		JSONArray jsonArray = new JSONArray();
		JSONParser jsonParser = new JSONParser();
		
		try {
			jsonObject.put("Name", "Nikhil");
			jsonObject.put("Age", 28);
			jsonObject.put("Address", "Mumbai");
			
			Object object = jsonParser.parse(new FileReader	("/home/bridgeit/Desktop/json/simple.json"));
			JSONObject jsonObject2 = (JSONObject) object;
			
			String name = (String) jsonObject2.get("Name");
			String Address = (String) jsonObject2.get("Address");
			System.out.println("Name: "+name);
			System.out.println("Address: "+Address);
			
			FileWriter fileWriter = new FileWriter("/home/bridgeit/Desktop/json/simple.json");
			fileWriter.write(jsonObject.toString());
			fileWriter.close();
		} catch (Exception e) {
			
		}
		
 }
}