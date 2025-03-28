package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.models.dto.Ingredient;
import is.nutritivna_zona.repositories.IngredientEntityRepository;
import is.nutritivna_zona.services.IngredientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final IngredientEntityRepository ingredientEntityRepository;
    private final ModelMapper modelMapper;

    public IngredientServiceImpl(IngredientEntityRepository ingredientEntityRepository, ModelMapper modelMapper) {
        this.ingredientEntityRepository = ingredientEntityRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public Set<Ingredient> findAll() {
        return ingredientEntityRepository.findAll().stream().map(i -> modelMapper.map(i, Ingredient.class)).collect(Collectors.toSet());
    }
}
