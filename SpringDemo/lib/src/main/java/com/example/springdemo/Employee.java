package com.example.springdemo;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int empId;
	private String name;
	private List<String> contacts = new ArrayList<>();
	
	// HAS-A/Aggregation
	private Address address;
	
	Employee() {}

	public Employee(int empId, String name, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public Employee(int empId, String name, Address address, List<String> contacts ) {
		super();
		this.empId = empId;
		this.name = name;
		this.contacts = contacts;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", contacts=" + contacts + ", address=" + address + "]";
	}

	

		
}
