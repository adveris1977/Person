package telran.java51.person.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import telran.java51.person.dto.ChilDto;
import telran.java51.person.dto.CityPopulationDto;
import telran.java51.person.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

	Stream<Person> findByNameIgnoreCase(String name);

	Stream<Person> findByAddressCityIgnoreCase(@Param("cityName") String city);

	Stream<Person> findByBirthDateBetween(LocalDate from, LocalDate to);

	@Query("select new telran.java51.person.dto.CityPopulationDto(p.address.city, count(p)) from Person p group by p.address.city order by count(p) desc")
	List<CityPopulationDto> getCitiesPopulation();
	
	@Query("select  new telran.java51.person.dto.ChilDto(c.id, c.name, c.birthDate, c.address, c.kindergarten) from Child c ")
	List<ChilDto> getAllChild();
	
	@Query("select  new telran.java51.person.dto.EmployeeDto(e.id, e.name, e.birthDate, e.address, e.company, e.salary) from Employee e")
	List<ChilDto> getAllEmployeesBySalary(Integer minAge, Integer maxAge);
	
}
