package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.demo.entity.*;
import com.example.demo.services.EmployeeService;

@RestController
@CrossOrigin(origins="*")
public class EmployeeController {

	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(path = "/employees")
	public List<Employee> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/employees/{email_id}")
	public int findEmployeeById(@PathVariable("email_id") String email_id){
		return this.service.findById(email_id);
	}
	
	@GetMapping(path = "/home")
	public List<Badges> findAllBadges(){
		return this.service.findAll1();
	}
	
	@GetMapping(path = "/home/{badge_id}")
	public Badges findBadgeById(@PathVariable("badge_id") String badge_id){
		return this.service.findById1(badge_id);
	}
	
	@GetMapping(path = "/leaderboard")
	public List<LeaderBoard> displayLeaderboard(){
		List<Employee> e = this.service.findAll();
		List<LeaderBoard> list =new ArrayList<LeaderBoard>();
		for (Employee l: e) {
			LeaderBoard l1 = new LeaderBoard(l.getName(),l.getKudos_spent());
			list.add(l1);
		}
		return list;
	}
	
	@GetMapping(path = "/profile/{email_id}")
	public Profile getProfile(@PathVariable("email_id") String email_id){
		return this.service.getProfile(email_id);
	}
	
//	@GetMapping(path = "/restaurants/{id}")
//	public Restaurant findById(@PathVariable("id") int id){
//		
//		//todo
//	}
//	
//	@DeleteMapping(path = "/restaurants")
//	public Restaurant remove(@RequestBody Restaurant entity){
//		
//		//todo
//	}
	

//	@PostMapping(path = "/employees")
//	public ResponseEntity<Employee> add(@RequestBody Employee entity){
//		
//		Employee addedEntity = this.service.add(entity);
//		
//		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);		
//	}
	
	@PostMapping(path = "/home/cart")
	public ResponseEntity<Integer> buyBadge(@RequestBody Cart entity)
	{	

		System.out.println(entity);
		int addedEntity = this.service.buyBadge(entity);
		System.out.println(addedEntity);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);		
	}
	
	
//	@PostMapping(path = "/restaurants")
//	public ResponseEntity<Restaurant> add(@RequestBody Restaurant entity){
//		
//		Restaurant addedEntity = this.service.add(entity);
//		
//		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);		
//	}
	
	
	/*@PostMapping(path = "/employees/{email_id}")
	public void modify(@RequestBody String email_id, int amount){
		this.service.modify(email_id,amount);
	}*/
	
	
	
}
