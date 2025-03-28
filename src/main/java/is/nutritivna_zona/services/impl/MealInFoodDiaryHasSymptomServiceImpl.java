package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.models.MealSymptoms;
import is.nutritivna_zona.repositories.MealInFoodDiaryHasSymptomEntityRepository;
import is.nutritivna_zona.services.MealInFoodDiaryHasSymptomService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MealInFoodDiaryHasSymptomServiceImpl implements MealInFoodDiaryHasSymptomService {
    private final ModelMapper modelMapper;
    private final MealInFoodDiaryHasSymptomEntityRepository entityRepository;

    public MealInFoodDiaryHasSymptomServiceImpl(ModelMapper modelMapper, MealInFoodDiaryHasSymptomEntityRepository entityRepository) {
        this.modelMapper = modelMapper;
        this.entityRepository = entityRepository;
    }

    @Override
    public Set<MealSymptoms> findAll() {
        return entityRepository.findAll().stream().map(m -> modelMapper.map(m, MealSymptoms.class)).collect(Collectors.toSet());
    }
}
