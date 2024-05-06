package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
	

}
