package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.models.DiaryMealSymptoms;
import is.nutritivna_zona.models.entities.MealInFoodDiaryEntity;
import is.nutritivna_zona.repositories.MealInFoodDiaryEntityRepository;
import is.nutritivna_zona.services.MealInFoodDiaryService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class MealInFoodDiaryServiceImpl extends CrudJpaService<MealInFoodDiaryEntity, Integer> implements MealInFoodDiaryService {
    private final MealInFoodDiaryEntityRepository mealInFoodDiaryEntityRepository;
    private final ModelMapper modelMapper;

    public MealInFoodDiaryServiceImpl(MealInFoodDiaryEntityRepository mealInFoodDiaryEntityRepository, ModelMapper modelMapper) {
        super(mealInFoodDiaryEntityRepository, modelMapper, MealInFoodDiaryEntity.class);
        this.mealInFoodDiaryEntityRepository = mealInFoodDiaryEntityRepository;
        this.modelMapper = modelMapper;
    }
}
