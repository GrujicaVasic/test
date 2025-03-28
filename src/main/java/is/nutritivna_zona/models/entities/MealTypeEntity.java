package is.nutritivna_zona.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "meal_type")
public class MealTypeEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "mealTypeEntity")
    private List<MealInFoodDiaryEntity> mealInFoodDiaries = new LinkedList<>();

    @ManyToMany
    @JoinTable(name = "meal_in_menu_has_meal_type",
            joinColumns = @JoinColumn(name = "meal_type_id"),
            inverseJoinColumns = @JoinColumn(name = "meal_in_menu_id"))
    private List<MealInMenuEntity> mealInMenus = new LinkedList<>();

}