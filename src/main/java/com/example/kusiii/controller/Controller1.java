package com.example.kusiii.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kusiii.Entity.Entity1;
import com.example.kusiii.services.Service1;


@RestController
@RequestMapping("/data")
public class Controller1 {

	@Autowired
	Service1 obj;
	@GetMapping("/getdata")
	public List<Entity1> getd()
	{
	   return obj.getData();
	}
	
	@DeleteMapping("/deleteData")
	public void deleteD(@RequestParam String s)
	{
		obj.deleteByEmail(s);;
	}
	
	@PutMapping("/updateData")
	public void puD(@RequestParam Entity1 e)
	{
		obj.updateData(e);
	}
	@PostMapping("/postData")
	public void postD(@RequestBody Entity1 e)
	{
		obj.postdata(e);
	}
	
}
