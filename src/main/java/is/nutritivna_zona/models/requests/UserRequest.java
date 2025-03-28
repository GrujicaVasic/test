package is.nutritivna_zona.models.requests;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRequest {
    private String name;

    private String surname;

    private LocalDate birthDate;

    private String username;

    private String password;
}
