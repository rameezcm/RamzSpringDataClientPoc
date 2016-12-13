package sa.gosi.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sa.gosi.mvc.entity.Person;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Page<Person> findByNameLike(String name, Pageable pageable);
}
