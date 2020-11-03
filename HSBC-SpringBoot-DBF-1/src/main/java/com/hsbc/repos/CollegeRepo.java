package com.hsbc.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsbc.Entities.College;
//this is a interface (not a class). In an interface everything is an abstract

@Repository
public interface CollegeRepo extends JpaRepository<College,Integer> {
	
	public List<College> findByName(String na);
	public List<College> findByMarks(int a);
}
