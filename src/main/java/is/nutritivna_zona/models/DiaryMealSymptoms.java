package is.nutritivna_zona.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Data
public class DiaryMealSymptoms {
    private FoodDiary foodDiary;

    private Integer foodDiaryId;

    private LocalDate date;

    private LocalTime time;

    private String dayInWeek;

    private List<Symptom> symptoms;

    private String mealName;

    private String mealDescription;

//    private FoodDiaryEntity foodDiary;

//    private MealEntity meal;
}
