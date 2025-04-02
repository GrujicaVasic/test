package is.nutritivna_zona.models.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
public class Ingredient {
    private String name;

    private BigDecimal ingredientQuantityValue;

    private String ingredientQuantityValueInWords;
}
