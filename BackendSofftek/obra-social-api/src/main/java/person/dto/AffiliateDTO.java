package person.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AffiliateDTO
{
    private Long id;
    private String firstName;
    private String lastName;
    private String healthInsuranceCode;
    private String dni;

}
