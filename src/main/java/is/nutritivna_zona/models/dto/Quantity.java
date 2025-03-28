package is.nutritivna_zona.models.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Quantity {
    private BigDecimal quantity;
    private String quantityInWords;
    private Ingredient ingredient;
}
