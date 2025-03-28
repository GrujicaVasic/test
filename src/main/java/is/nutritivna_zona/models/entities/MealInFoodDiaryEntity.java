package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "meal_in_food_diary")
public class MealInFoodDiaryEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @NotNull
    @Column(name = "time", nullable = false)
    private LocalTime time;

    @NotNull
    @Lob
    @Column(name = "day_in_week", nullable = false)
    private String dayInWeek;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "food_diary_id", nullable = false)
    private FoodDiaryEntity foodDiary;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_id", nullable = false)
    private MealEntity meal;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_type_id", nullable = false)
    private MealTypeEntity mealTypeEntity;

    @ManyToMany
    @JoinTable(name = "meal_in_food_diary_has_symptom",
            joinColumns = @JoinColumn(name = "meal_in_food_diary_id"),
            inverseJoinColumns = @JoinColumn(name = "symptom_id"))
    private List<SymptomEntity> symptoms = new LinkedList<>();


}