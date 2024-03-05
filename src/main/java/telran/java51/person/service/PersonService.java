package telran.java51.person.service;

import telran.java51.person.dto.AddressDto;
import telran.java51.person.dto.PersonDto;

public interface PersonService {

	Boolean addPerson(PersonDto personDto);
	
	PersonDto findPersonById(Integer id);
	
	PersonDto upDatePerson(Integer id, String name);
	
	PersonDto upDateAddress(Integer id, AddressDto addressDto);
	
	PersonDto removePerson(Integer id);
	
	Iterable<PersonDto> findByName(String name);
	
	Iterable<PersonDto> findPersonsByCity(String city);
	
//	Iterable<PersonDto> findPersonsByAges(LocalDate from, LocalDate to);
}
