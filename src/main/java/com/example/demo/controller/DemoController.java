package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.RequestActivityLog;
import com.example.demo.bean.ReturnDemo;

@RestController
@RequestMapping("")
public class DemoController {
	
	@PostMapping(value = "/demo")
	public ReturnDemo activitylog(@RequestBody RequestActivityLog request) {
		ReturnDemo demo = new ReturnDemo();
		
		demo.setYouHigh(request.getHigh());
		demo.setYouWeight(request.getWeight());
		return demo;
	}


}
