package person.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class User{

	private String firstName;
	private String lastName;
	private String dni;
	private Role role;
	//private String email;
	//private String password;

}
