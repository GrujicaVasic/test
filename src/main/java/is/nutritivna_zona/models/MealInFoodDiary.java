package is.nutritivna_zona.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Data
public class MealInFoodDiary {
    private String mealName;

    private String mealDescription;

    private LocalDate date;

    private LocalTime time;

    private String dayInWeek;

    private Set<Symptom> symptoms;
}
