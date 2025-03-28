package is.nutritivna_zona.models;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Data
public class MealSymptoms {
    //ako ostavis samo id polje a ne mealId, onda uzima id od simptoma
    //date, time budu null ako polja ne nazoves mealDate, mealTime
    private Integer mealId;

    private LocalDate mealDate;

    private LocalTime mealTime;

    private String dayInWeek;

    private String mealName;

    private Set<Symptom> symptoms;    //nikako ne mogu dobit' kolekciju simpotoma
//    private Integer symptomId;
//    private String symptomName;
}
