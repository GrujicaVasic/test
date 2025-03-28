package is.nutritivna_zona.models;

import is.nutritivna_zona.models.dto.QuestionnaireAnswer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuestionnaire extends User {
    List<QuestionnaireAnswer> answers;
}
