package telran.java51.person.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EmployeeDto extends PersonDto {

	String company;
	int salary;
	
	public EmployeeDto(Integer id, String name, LocalDate birthDate, AddressDto address, String company, int salary) {
		super(id, name, birthDate, address);
		this.company = company;
		this.salary = salary;
	}
	
	
}
