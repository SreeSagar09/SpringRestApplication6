package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app2", consumes = "application/xml")
public class ApplicationController2 {
	
	@RequestMapping(path = "/handlerMethod1")
	public ResponseEntity<Map<String, Object>> handlerMethod1(@RequestBody Map<String, Object> body) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> info = new LinkedHashMap<>();
			info.put("methodName", "handlerMethod1");
			info.put("className", "ApplicationController1");
			info.put("description", "This handlerMethod1 method can consumes xml and produces all media types.");
			
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("requestedData", body);
			data.put("informationData", info);
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod2", consumes = "application/json")
	public ResponseEntity<Map<String, Object>> handlerMethod2(@RequestBody Map<String, Object> body) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> info = new LinkedHashMap<>();
			info.put("methodName", "handlerMethod2");
			info.put("className", "ApplicationController1");
			info.put("description", "This handlerMethod2 method can consumes both xml and json and produces all media types.");
			
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("requestedData", body);
			data.put("informationData", info);
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod3", produces = "application/json")
	public ResponseEntity<Map<String, Object>> handlerMethod3(@RequestBody Map<String, Object> body) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> info = new LinkedHashMap<>();
			info.put("methodName", "handlerMethod3");
			info.put("className", "ApplicationController1");
			info.put("description", "This handlerMethod3 method can consumes both xml and produces json.");
			
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("requestedData", body);
			data.put("informationData", info);
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
}
