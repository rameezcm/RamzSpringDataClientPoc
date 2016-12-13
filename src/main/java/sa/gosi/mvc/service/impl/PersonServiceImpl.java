package sa.gosi.mvc.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sa.gosi.mvc.entity.Person;
import sa.gosi.mvc.repository.PersonCrudRepo;
import sa.gosi.mvc.repository.PersonRepository;
import sa.gosi.mvc.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Inject
	protected PersonRepository personRepository;

	@Inject
	protected PersonCrudRepo personCrudRepo;

	@Override
	@Transactional(readOnly = true)
	public List<Person> getAll() {
		List<Person> persons = IteratorUtils.toList(personCrudRepo.findAll().iterator());
		return persons;
	}

	@Override
	@Transactional
	public Person insert(Person person) {
		return personRepository.save(person);
	}
}
