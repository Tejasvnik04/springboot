package com.example.kusiii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kusiii.Entity.Entity1;

@Repository
public interface Repository1 extends JpaRepository<Entity1,String>{

	
}
