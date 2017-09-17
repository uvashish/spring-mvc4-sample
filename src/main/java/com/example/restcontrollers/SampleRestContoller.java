package com.example.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestContoller {

	@RequestMapping(value="/samples", method=RequestMethod.GET)
	public List<String> getAllSamples(){
		List<String> list = new ArrayList<String>();
		list.add("test");
		list.add("test2");
		return list;
	}
}
