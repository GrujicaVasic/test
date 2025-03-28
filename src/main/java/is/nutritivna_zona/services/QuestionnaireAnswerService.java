package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.models.dto.QuestionnaireAnswer;

import java.util.List;

public interface QuestionnaireAnswerService extends CrudService<Integer> {
    List<QuestionnaireAnswer> findAll();
    List<QuestionnaireAnswer> getAllQuestionnaireAnswersByClientId(Integer id);
}
