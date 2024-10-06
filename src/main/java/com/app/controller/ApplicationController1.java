package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app1")
public class ApplicationController1 {
	
	@RequestMapping(path = "/handlerMethod1")
	public ResponseEntity<Map<String, Object>> handlerMethod1(@RequestBody Map<String, Object> body) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> info = new LinkedHashMap<>();
			info.put("methodName", "handlerMethod1");
			info.put("className", "ApplicationController1");
			info.put("description", "This handlerMethod1 method can consumes and produces all media types.");
			
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
			info.put("description", "This handlerMethod2 method can consumes json and produces all media types.");
			
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("requestedData", body);
			data.put("informationData", info);
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod3", produces = "application/xml")
	public ResponseEntity<Map<String, Object>> handlerMethod3(@RequestBody Map<String, Object> body) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> info = new LinkedHashMap<>();
			info.put("methodName", "handlerMethod3");
			info.put("className", "ApplicationController1");
			info.put("description", "This handlerMethod3 method can consumes all media types and produces xml.");
			
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("requestedData", body);
			data.put("informationData", info);
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod4", consumes = { "application/xml" , "application/json" }, produces = "application/json")
	public ResponseEntity<Map<String, Object>> handlerMethod4(@RequestBody Map<String, Object> body) {
		Map<String, Object> info = new LinkedHashMap<>();
		info.put("methodName", "handlerMethod4");
		info.put("className", "ApplicationController1");
		info.put("description", "This handlerMethod4 method can consumes both xml and json and produces json.");
		
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("requestedData", body);
		data.put("informationData", info);
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod5", consumes = "application/xml", produces = { "application/json", "application/xml" })
	public ResponseEntity<Map<String, Object>> handlerMethod5(@RequestBody Map<String, Object> body) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> info = new LinkedHashMap<>();
			info.put("methodName", "handlerMethod5");
			info.put("className", "ApplicationController1");
			info.put("description", "This handlerMethod5 method can consumes xml and produces both xml and json.");
			
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("requestedData", body);
			data.put("informationData", info);
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod6", consumes = "application/xml", produces = "application/xml")
	public ResponseEntity<Map<String, Object>> handlerMethod6(@RequestBody Map<String, Object> body) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> info = new LinkedHashMap<>();
			info.put("methodName", "handlerMethod6");
			info.put("className", "ApplicationController1");
			info.put("description", "This handlerMethod6 method can consumes xml and produces xml.");
			
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("requestedData", body);
			data.put("informationData", info);
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod7", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Map<String, Object>> handlerMethod7(@RequestBody Map<String, Object> body) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> info = new LinkedHashMap<>();
			info.put("methodName", "handlerMethod7");
			info.put("className", "ApplicationController1");
			info.put("description", "This handlerMethod7 method can consumes json and produces json.");
			
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
