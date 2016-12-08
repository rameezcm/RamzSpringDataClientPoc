package com.example.mvc.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.mvc.entity.Person;

public interface PersonService {
    Person insert(Person person);
	List<Person> getAll();
}
