package sa.gosi.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import sa.gosi.mvc.entity.Person;

public interface PersonCrudRepo extends CrudRepository<Person, Long>{

}
