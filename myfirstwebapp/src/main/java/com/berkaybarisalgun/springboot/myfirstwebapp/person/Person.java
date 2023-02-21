package com.berkaybarisalgun.springboot.myfirstwebapp.person;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;

import jakarta.validation.constraints.Size;

public class Person {
	
	
	public Person(String name,String surname,String age ,int id ) {
		super();
		this.name = name;
		this.id = id;
		this.surname = surname;
		this.age = age;
	}
	//@Size(min=3,message="Enter atleast 3 characters")	
	
	@Size(min=3,message="Enter atleast 3 characters")
	private String name;
	private int id;
	
	
	
	private String surname;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", surname=" + surname + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
