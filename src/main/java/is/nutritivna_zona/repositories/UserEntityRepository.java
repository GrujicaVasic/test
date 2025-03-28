package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
}
