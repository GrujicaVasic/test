package is.nutritivna_zona.models.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class IngredientQuantity {
    private String ingredientName;
    private BigDecimal value;
    private String valueInWords;
}
