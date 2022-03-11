package com.example.demo.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	private String contactNo;
	private  double salary;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="loginId")
	private Login login;
	
	// Constructors
	//Getters &Setters
	
	

}
