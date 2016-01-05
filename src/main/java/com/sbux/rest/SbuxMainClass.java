package com.sbux.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SbuxMainClass {

	public static void main(String[] args) {
	
		Map<String,String> urlVariables = new HashMap<String, String>();
		urlVariables.put("id", "1");
		
		RestTemplate restClient = new RestTemplate();
		
		ResponseEntity<String> response =  restClient.getForEntity("http://jsonplaceholder.typicode.com/posts/{id}", String.class, urlVariables);
		
		System.out.println("Response Body>>  "+response.getBody());
		System.out.println("<< End of body >>");
		
	}

}
