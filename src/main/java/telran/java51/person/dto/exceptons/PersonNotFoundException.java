package telran.java51.person.dto.exceptons;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -5722440904593254047L;

}
