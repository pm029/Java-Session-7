package com.hsbc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.Entities.College;
import com.hsbc.repos.CollegeRepo;



@RestController
public class FirstController {


	@Autowired
	CollegeRepo repoRef;
	
	
	
	@GetMapping("/showall")
	public List<College> showall(){
		return repoRef.findAll();
	}
	
	@GetMapping("/showbyname/{name}")
	public List<College> showbyname(@PathVariable("name") String name) {
		return repoRef.findByName(name);
		
	}
	
	@PostMapping("/RecordEntry")
	public String RecordInsert(@RequestBody College ref) {

		Optional<College> optref= repoRef.findById(ref.getRegno());
		if(optref.isPresent()) {
			return "Regno already taken";
			
		}else {
			repoRef.save(ref);
			return "Regno saved";}
	}
	
	@GetMapping ("/showrecord/{regno}")
	public College showRecord(@PathVariable("regno") int R){
		College student = null;
		Optional<College> optref= repoRef.findById(R);
		if(optref.isPresent()) {
			student=optref.get();
			//System.out.println(ref2.getName());
		}
		return student;
	}
	
	@GetMapping("/saverecord1")
	public String savingrecord1() {
		
		College student=new College();
		
		student.setRegno(3);
		student.setName("ABC");
		student.setMarks(75);
		
		repoRef.save(student);
		
		
		return "Record Saved";
	}
	
	@GetMapping("/saverecord2/{regno}/{name}/{marks}")
	public String savingrecord(@PathVariable("regno") int regno,
								@PathVariable("name") String name,
								@PathVariable("marks") int marks) {
		
		College student=new College();
		
		student.setRegno(regno);
		student.setName(name);
		student.setMarks(marks);
		
		repoRef.save(student);
		
		
		return "Record Saved2";
	}
}
