package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import model.enums.Role;

@MappedSuperclass
@Data
public abstract class User{

	private String firstName;
	
	private String lastName;
	
	private String dni;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private String email;

	@JsonIgnore
	private String password;
}
