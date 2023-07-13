package com.example.kusiii.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kusiii.Entity.Entity1;
import com.example.kusiii.repository.Repository1;

@Service
public class Service1 {
	@Autowired
	Repository1 obj1;
	public void postdata(Entity1 obj)
	{
		obj1.save(obj);
	}
	public List<Entity1> showData()
	{
		return obj1.findAll();
	}
	public void deleteByEmail(String email)
	{
		obj1.deleteById(email);
	}
	
	public void updateData(Entity1 o)
	{
		obj1.save(o);
	}
	public List<Entity1> getData()
	{
		return obj1.findAll();
	}

}
