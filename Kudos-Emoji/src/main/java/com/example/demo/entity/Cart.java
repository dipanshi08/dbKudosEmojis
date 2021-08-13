package com.example.demo.entity;

import java.util.List;

public class Cart {
	
	String email_id;
	int kudos_cost;
	List < String > badge_id;
	
	public Cart() {
		super();
	}
	public Cart(String email_id, int kudos_cost, List<String> badge_id) {
		super();
		this.email_id = email_id;
		this.kudos_cost = kudos_cost;
		this.badge_id = badge_id;
	}
	
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getKudos_cost() {
		return kudos_cost;
	}
	public void setKudos_cost(int kudos_cost) {
		this.kudos_cost = kudos_cost;
	}
	public List<String> getBadge_id() {
		return badge_id;
	}
	public void setBadge_id(List<String> badge_id) {
		this.badge_id = badge_id;
	}
	
	@Override
	public String toString() {
		return "Cart [email_id=" + email_id + ", kudos_cost=" + kudos_cost + ", badge_id=" + badge_id + "]";
	}
}
