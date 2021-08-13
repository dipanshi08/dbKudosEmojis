package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "badge")

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Badges {
	@Id
	String badge_id;
	String badge_name;
	int badge_cost;
	
	public Badges() {
		super();
	}
	public Badges(String badge_id, String badge_name, int badge_cost) {
		super();
		this.badge_id = badge_id;
		this.badge_name = badge_name;
		this.badge_cost = badge_cost;
	}
	
	public String getBadge_id() {
		return badge_id;
	}
	public void setBadge_id(String badge_id) {
		this.badge_id = badge_id;
	}
	public String getBadge_name() {
		return badge_name;
	}
	public void setBadge_name(String badge_name) {
		this.badge_name = badge_name;
	}
	public int getBadge_cost() {
		return badge_cost;
	}
	public void setBadge_cost(int badge_cost) {
		this.badge_cost = badge_cost;
	}
	
	@Override
	public String toString() {
		return "Badges [badge_id=" + badge_id + ", badge_name=" + badge_name + ", badge_cost=" + badge_cost + "]";
	}
}
