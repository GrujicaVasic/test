package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.QuestionnaireAnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface QuestionnaireAnswerEntityRepository extends JpaRepository<QuestionnaireAnswerEntity, Integer> {
    Set<QuestionnaireAnswerEntity> getAllByUser_Id(Integer id);
}
