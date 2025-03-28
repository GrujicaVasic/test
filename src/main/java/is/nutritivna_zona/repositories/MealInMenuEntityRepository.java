package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MealInMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealInMenuEntityRepository extends JpaRepository<MealInMenuEntity, Integer> {
}
