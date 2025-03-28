package is.nutritivna_zona.models.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Measures {
    private LocalDate date;

    private BigDecimal waistCircumference;

    private BigDecimal stomachCircumference;

    private BigDecimal hipsCircumference;

    private BigDecimal height;

    private BigDecimal bodyMass;
}
