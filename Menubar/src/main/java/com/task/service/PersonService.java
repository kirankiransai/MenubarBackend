package com.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.model.Person;
import com.task.repository.PersonRepository;

@Service
public class PersonService {
	 
	
		@Autowired
	    private PersonRepository personRepository;


		public Person save(Person person) {
			return  personRepository.save(person);
		}

		 public List<Person> getAllPersons() {
		        return personRepository.findAll();
		    }

}
