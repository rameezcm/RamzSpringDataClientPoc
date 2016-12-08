package com.example.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.mvc.entity.Person;

public interface PersonCrudRepo extends CrudRepository<Person, Long>{

}
