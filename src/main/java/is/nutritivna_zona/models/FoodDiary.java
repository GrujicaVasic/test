package is.nutritivna_zona.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Data
public class FoodDiary {
    private LocalDate date;

    private String userUsername;

    private Set<MealInFoodDiary> mealInFoodDiaries;
}
