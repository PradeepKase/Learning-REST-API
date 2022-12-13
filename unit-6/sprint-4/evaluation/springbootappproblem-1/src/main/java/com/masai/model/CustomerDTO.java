package com.masai.model;

public class CustomerDTO {
	private String name;
	private String address;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public CustomerDTO() {
		
	}
	public CustomerDTO(String name, String address, Integer age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	
	
}
