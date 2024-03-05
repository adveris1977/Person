package telran.java51.person.dao;

import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import telran.java51.person.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	
	Stream<Person> findByNameIgnoreCase(String name);

	Stream<Person> findPersonsByCity(String city);
	
//	Stream<Person> findAgeBetween(LocalDate from, LocalDate to);
}
