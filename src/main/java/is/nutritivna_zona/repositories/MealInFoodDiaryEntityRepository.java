package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MealInFoodDiaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealInFoodDiaryEntityRepository extends JpaRepository<MealInFoodDiaryEntity, Integer> {
}
