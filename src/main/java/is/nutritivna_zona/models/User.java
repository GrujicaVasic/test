package is.nutritivna_zona.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class User {
    private String name;

    private String surname;

    private LocalDate birthDate;

    private String username;
}
