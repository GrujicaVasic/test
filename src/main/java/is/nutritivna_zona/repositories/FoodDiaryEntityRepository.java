package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.FoodDiaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface FoodDiaryEntityRepository extends JpaRepository<FoodDiaryEntity, Integer> {
    Set<FoodDiaryEntity> getAllByUser_Id(Integer id);
}
