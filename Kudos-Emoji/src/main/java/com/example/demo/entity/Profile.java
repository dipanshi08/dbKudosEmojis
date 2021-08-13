package com.example.demo.entity;

import java.util.List;

public class Profile {
	
	Employee e;
	List < String > badge_id;
	List < Integer > badge_count;
	List < String > badge_name;
	
	public Profile() {
		super();
	}
	
	public Profile(Employee e, List<String> badge_id, List<Integer> badge_count, List<String> badge_name) {
		super();
		this.e = e;
		this.badge_id = badge_id;
		this.badge_count = badge_count;
		this.badge_name = badge_name;
	}
	
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public List<String> getBadge_id() {
		return badge_id;
	}
	public void setBadge_id(List<String> badge_id) {
		this.badge_id = badge_id;
	}
	public List<Integer> getBadge_count() {
		return badge_count;
	}
	public void setBadge_count(List<Integer> badge_count) {
		this.badge_count = badge_count;
	}
	public List<String> getBadge_name() {
		return badge_name;
	}
	public void setBadge_name(List<String> badge_name) {
		this.badge_name = badge_name;
	}

	@Override
	public String toString() {
		return "Profile [e=" + e + ", badge_id=" + badge_id + ", badge_count=" + badge_count + ", badge_name="
				+ badge_name + "]";
	}
	
}
