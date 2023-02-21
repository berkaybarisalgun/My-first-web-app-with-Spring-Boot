package com.berkaybarisalgun.springboot.myfirstwebapp.person;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class PersonController {
	
	
	
	public PersonController(PersonService personservice) {
		super();
		this.personservice = personservice;
	}

	private PersonService personservice;
	// list persons
	
	@RequestMapping("list-persons")
	public String listAllPersons(ModelMap model) {
		String username=(String) model.get("name");
		List<Person> persons=personservice.findByUsername(username);
		model.addAttribute("persons",persons);
		return "listPersons";
	}
	
	@RequestMapping(value="add-person",method=RequestMethod.GET)
	public String showAllPersons(ModelMap model) {
		Person person=new Person(null, null, null, 0);
		model.put("person", person);
		return "person";
	}
	@RequestMapping(value="add-person",method=RequestMethod.POST)
	public String AddNewPerson(@Valid Person person,BindingResult result) {
		if(result.hasErrors()) {
			return "person";
		}
		personservice.addPerson(person.getName(),person.getSurname(),person.getAge());		
		return "redirect:list-persons";
	}
	@RequestMapping("delete-person")
	public String deletePerson(@RequestParam int id) {
		personservice.deleteById(id);
		return "redirect:list-persons";
	}
	

	@RequestMapping(value="update-person",method=RequestMethod.GET)
	public String showUpdatePersonPage(@RequestParam int id,ModelMap model) {
		Person person=personservice.findById(id);
		
		model.addAttribute("person",person);
		return "person";
		
	}
	
	@RequestMapping(value="update-person",method=RequestMethod.POST)
	public String updateNewPerson(@Valid Person person,BindingResult result) {
		if(result.hasErrors()) {
			return "person";
		}
		
			
			personservice.updatePerson(person);
			return "redirect:list-persons";
	
	
}
	

}
