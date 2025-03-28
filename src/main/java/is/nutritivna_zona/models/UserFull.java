package is.nutritivna_zona.models;

import is.nutritivna_zona.models.dto.Measures;
import is.nutritivna_zona.models.dto.QuestionnaireAnswer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserFull extends User {
    Set<QuestionnaireAnswer> answers;
    List<Measures> measures;
    Set<FoodDiary> foodDiaries;
}
