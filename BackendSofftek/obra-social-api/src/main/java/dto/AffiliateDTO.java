package dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.enums.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AffiliateDTO{
    private Long id;
    
    @NotBlank(message = ": El campo 'nombre' no debe estar vacío.")
    @Size(min = 2, message = ": El campo 'nombre' debe tener al menos 2 caracteres.")
    private String firstName;
    
    @NotBlank(message = ": El campo 'apellido' no debe estar vacío.")
    @Size(min = 2, message = ": El campo 'apellido' debe tener al menos 2 caracteres.")
    private String lastName;
    
    @NotBlank(message = ": El campo 'dni' no debe estar vacío.")
    @Size(min = 7, max = 9, message = ": El campo 'dni' debe tener entre 7 y 9 dígitos.")
    @Pattern(regexp = "\\d+", message = ": El campo 'dni' debe contener solo dígitos númericos.")
    private String dni;
    
    private String healthInsuranceCode;
    private Role role;
    
    @NotBlank(message = ": El campo 'email' no debe estar vacío.")
    @Email(message = ": El campo 'email' debe contener un email válido.")
	private String email;
    
    @NotBlank(message = ": El campo 'contraseña' no debe estar vacío.")
    @Size(min = 8, message = ": El campo 'contraseña' debe tener al menos 8 caracteres.")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = ": El campo 'contraseña' debe contener al menos una mayúscula, una minúscula, un número y un carácter especial.")
	private String password;
}
