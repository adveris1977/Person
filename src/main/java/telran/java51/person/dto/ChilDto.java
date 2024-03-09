package telran.java51.person.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChilDto extends PersonDto {

	String kindergarten;
	
	
	public ChilDto(Integer id, String name, LocalDate birthDate, AddressDto address, String kindergarten) {
		super(id, name, birthDate, address);
		this.kindergarten = kindergarten;
	}

}
