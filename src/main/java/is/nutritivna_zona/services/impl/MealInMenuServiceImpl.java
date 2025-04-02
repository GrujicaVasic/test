package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.models.dto.MealInMenu;
import is.nutritivna_zona.models.entities.MealInMenuEntity;
import is.nutritivna_zona.repositories.MealInMenuEntityRepository;
import is.nutritivna_zona.services.MealInMenuService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class MealInMenuServiceImpl extends CrudJpaService<MealInMenuEntity, Integer> implements MealInMenuService {
    private final MealInMenuEntityRepository mealInMenuEntityRepository;
    private final ModelMapper modelMapper;

    public MealInMenuServiceImpl(MealInMenuEntityRepository mealInMenuEntityRepository, ModelMapper modelMapper) {
        super(mealInMenuEntityRepository, modelMapper, MealInMenuEntity.class);
        this.mealInMenuEntityRepository = mealInMenuEntityRepository;
        this.modelMapper = modelMapper;
    }
}
