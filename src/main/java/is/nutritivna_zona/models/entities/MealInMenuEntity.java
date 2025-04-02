package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "meal_in_menu")
public class MealInMenuEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_id", nullable = false)
    private MealEntity meal;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "menu_id", nullable = false)
    private MenuEntity menu;

    @ManyToMany
    @JoinTable(name = "meal_in_menu_has_ingredient",
            joinColumns = @JoinColumn(name = "meal_in_menu_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private List<IngredientEntity> ingredients = new LinkedList<>();

    @ManyToMany
    @JoinTable(name = "meal_in_menu_has_meal_type",
            joinColumns = @JoinColumn(name = "meal_in_menu_id"),
            inverseJoinColumns = @JoinColumn(name = "meal_type_id"))
    private List<MealTypeEntity> mealTypeEntities = new LinkedList<>();

    @OneToMany(mappedBy = "mealInMenu")
    private List<IngredientQuantityEntity> ingredientQuantities = new LinkedList<>();

}