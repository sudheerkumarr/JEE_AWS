package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
public class Employee {
	
	// Fields
	@Id
	@GeneratedValue
	private int empId;
	
	//@Getter
	//@Setter
	private String empName;
	
	private  double salary;
	
	// Constructors
	//Getters &Setters
	
	

}
