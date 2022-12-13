package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Gym {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String gym_id; 
	private String gym_name;
	private String monthly_fee;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Person> persons = new ArrayList<>();
	
    
	@ManyToOne(cascade = CascadeType.ALL)
	private Trainer trainer;
	
	
	
	
	public Gym() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Gym(String gym_id, String gym_name, String monthly_fee) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
	}




	public String getGym_id() {
		return gym_id;
	}




	public void setGym_id(String gym_id) {
		this.gym_id = gym_id;
	}




	public String getGym_name() {
		return gym_name;
	}




	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}




	public String getMonthly_fee() {
		return monthly_fee;
	}




	public void setMonthly_fee(String monthly_fee) {
		this.monthly_fee = monthly_fee;
	}




	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + "]";
	}
	
	
	
	

}
