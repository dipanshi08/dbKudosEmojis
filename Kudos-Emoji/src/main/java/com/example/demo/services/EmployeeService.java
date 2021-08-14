package com.example.demo.services;

import java.util.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repos.*;
import com.example.demo.entity.*;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private BadgesRepository repo1;
	@Autowired
	private MappingTableRepository repo2;
	@Autowired
	private ProfileRepository repo3;
	
	public List<Employee> findAll(){
		return this.repo.findAll();
	}
	
	public int findById(String email_id){
		
		Employee e = this.repo.findById(email_id).get();
		return e.getKudos_points();
	}
	
	public List<Badges> findAll1(){
		return this.repo1.findAll();
	}
	
	public Badges findById1(String badge_id){
		
		return this.repo1.findById(badge_id).get();
		
	}
	
	public Profile getProfile(String email_id){
		List<String> profile = this.repo3.getProfile(email_id);
		List < String > badge_id = new ArrayList<String>();
		List < Integer > badge_count =new ArrayList<Integer>();
		List < String > badge_name = new ArrayList<String>();
		Employee e = this.repo.findById(email_id).get();
		for (String event : profile) {
            String[] data = event.split(",");
            badge_id.add(data[0]);
            badge_count.add(Integer.parseInt(data[2]));
            badge_name.add(data[1]);
        }
		Profile p = new Profile(e,badge_id,badge_count,badge_name);
		//System.out.println(p.toString());
		return p;
	}

	public int buyBadge(Cart entity) 
	{
		String email_id = entity.getEmail_id();
		int kc = entity.getKudos_cost();
		List < String > bid = entity.getBadge_id();
		System.out.println(email_id+" "+kc);
		System.out.println(bid);
		
		Employee e = this.repo.findById(email_id).get();
		e.setKudos_points(e.getKudos_points()-kc);
		e.setKudos_spent(e.getKudos_spent()+kc);
		repo.save(e);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> mapt = this.repo2.getMappingTable(email_id);
		for (String event : mapt) {
            String[] data = event.split(",");
            map.put(data[1], Integer.parseInt(data[2]));
        }
		
		for(String b:bid)
		{
//			System.out.println("In Iterate: "+b);
			if(!map.containsKey(b))
			{
//				System.out.println("add");
				MappingTable aaa = new MappingTable(email_id, b, 1);
				map.put(b, 1);
				repo2.save(aaa);
			}
			else
			{
//				System.out.println("update");
				MappingTable aaa = new MappingTable(email_id, b, 1+map.get(b));
				map.replace(b, 1+map.get(b));
				repo2.save(aaa);
			}
		}
		
		e = this.repo.findById(email_id).get();
		int kp = e.getKudos_points();
		System.out.println(kp);
		
		return kp;
	}
}
