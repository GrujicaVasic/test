package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.models.dto.QuestionnaireAnswer;
import is.nutritivna_zona.models.entities.QuestionnaireAnswerEntity;
import is.nutritivna_zona.repositories.QuestionnaireAnswerEntityRepository;
import is.nutritivna_zona.services.QuestionnaireAnswerService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class QuestionnaireAnswerServiceImpl extends CrudJpaService<QuestionnaireAnswerEntity, Integer> implements QuestionnaireAnswerService {
    private final ModelMapper modelMapper;
    private final QuestionnaireAnswerEntityRepository repository;

    public QuestionnaireAnswerServiceImpl(ModelMapper modelMapper, QuestionnaireAnswerEntityRepository repository) {
        super(repository, modelMapper, QuestionnaireAnswerEntity.class);
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    @Override
    public List<QuestionnaireAnswer> findAll() {
        return repository.findAll().stream().map(q -> modelMapper.map(q, QuestionnaireAnswer.class)).collect(Collectors.toList());
    }

    @Override
    public List<QuestionnaireAnswer> getAllQuestionnaireAnswersByClientId(Integer id) {
        return repository.getAllByUser_Id(id).stream().map(q -> modelMapper.map(q, QuestionnaireAnswer.class)).collect(Collectors.toList());
    }
}
