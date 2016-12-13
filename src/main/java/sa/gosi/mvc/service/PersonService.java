package sa.gosi.mvc.service;

import java.util.List;

import org.springframework.data.domain.Page;

import sa.gosi.mvc.entity.Person;

public interface PersonService {
    Person insert(Person person);
	List<Person> getAll();
}
