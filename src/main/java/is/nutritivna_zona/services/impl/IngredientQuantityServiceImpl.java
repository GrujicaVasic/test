package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.models.entities.IngredientQuantityEntity;
import is.nutritivna_zona.repositories.IngredientQuantityEntityRepository;
import is.nutritivna_zona.services.IngredientQuantityService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IngredientQuantityServiceImpl extends CrudJpaService<IngredientQuantityEntity, Integer> implements IngredientQuantityService {
    private final IngredientQuantityEntityRepository ingredientQuantityEntityRepository;
    private final ModelMapper modelMapper;

    public IngredientQuantityServiceImpl(IngredientQuantityEntityRepository ingredientQuantityEntityRepository, ModelMapper modelMapper) {
        super(ingredientQuantityEntityRepository, modelMapper, IngredientQuantityEntity.class);
        this.ingredientQuantityEntityRepository = ingredientQuantityEntityRepository;
        this.modelMapper = modelMapper;
    }
}
