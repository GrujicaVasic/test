package is.nutritivna_zona.models.requests;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MeasuresRequest {
    private LocalDate date;

    private BigDecimal waistCircumference;

    private BigDecimal stomachCircumference;

    private BigDecimal hipsCircumference;

    private BigDecimal height;

    private BigDecimal bodyMass;

    private Integer userId;
}
