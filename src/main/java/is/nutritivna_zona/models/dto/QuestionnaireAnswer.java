package is.nutritivna_zona.models.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class QuestionnaireAnswer {
    private LocalDate date;

    private String currentGoal;

    private String dailyMealsNumber;

    private String nonConsumedGroceries;

    private String mandatoryFood;

    private String allergyIntolerance;

    private String supplementation;

    private String medicalCondition;

    private String selfPreparingFood;

    private String physicalActivityLevel;

    private String dailyActivities;

    private String bedtime;
}
