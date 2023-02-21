package com.berkaybarisalgun.springboot.myfirstwebapp.person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;



import jakarta.validation.Valid;

@Service
public class PersonService {
	private static List<Person> persons=new ArrayList<>();
	
	private static int personCount=0;
	
	static {
		persons.add(new Person("Berkay","Algun","2000.01.01",++personCount));
		persons.add(new Person("Emirhan","Kurtulus","2000.01.01",++personCount));
		persons.add(new Person("Kenan","Efe","2000.01.01",++personCount));
	}
	
	public List<Person> findByUsername(String username) {
		return persons;
		
	}
	
	public void addPerson(String name,String surname,String age) {
		Person person=new Person(name, surname, age,++personCount);
		persons.add(person);		
	}
	public void deleteById(int id) {		
		Predicate<? super Person> predicate
		=person->person.getId()==id;
		persons.removeIf(predicate);		
	}
public Person findById(int id) {
		
		Predicate<? super Person> predicate
		=person->person.getId()==id;
		Person person = persons.stream().filter(predicate).findFirst().get();
		return person;
	}

	public void updatePerson(@Valid Person person) {
		deleteById(person.getId());
		persons.add(person);
		
	}


}
