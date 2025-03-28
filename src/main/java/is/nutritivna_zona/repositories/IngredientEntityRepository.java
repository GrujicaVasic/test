package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientEntityRepository extends JpaRepository<IngredientEntity, Integer> {
}
