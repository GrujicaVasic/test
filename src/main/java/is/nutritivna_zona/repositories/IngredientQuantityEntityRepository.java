package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.IngredientQuantityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientQuantityEntityRepository extends JpaRepository<IngredientQuantityEntity, Integer> {
}
