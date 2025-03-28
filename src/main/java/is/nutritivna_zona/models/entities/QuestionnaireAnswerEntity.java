package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "questionnaire_answers")
public class QuestionnaireAnswerEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Lob
    @Column(name = "current_goal")
    private String currentGoal;

    @Lob
    @Column(name = "daily_meals_number")
    private String dailyMealsNumber;

    @Lob
    @Column(name = "non_consumed_groceries")
    private String nonConsumedGroceries;

    @Lob
    @Column(name = "mandatory_food")
    private String mandatoryFood;

    @Lob
    @Column(name = "allergy_intolerance")
    private String allergyIntolerance;

    @Lob
    @Column(name = "supplementation")
    private String supplementation;

    @Lob
    @Column(name = "medical_condition")
    private String medicalCondition;

    @Lob
    @Column(name = "self_preparing_food")
    private String selfPreparingFood;

    @Lob
    @Column(name = "physical_activity_level")
    private String physicalActivityLevel;

    @Lob
    @Column(name = "daily_activities")
    private String dailyActivities;

    @Lob
    @Column(name = "bedtime")
    private String bedtime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private is.nutritivna_zona.models.entities.UserEntity user;

}