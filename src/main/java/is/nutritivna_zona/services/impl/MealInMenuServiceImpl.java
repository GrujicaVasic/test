package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.models.dto.MealInMenu;
import is.nutritivna_zona.repositories.MealInMenuEntityRepository;
import is.nutritivna_zona.services.MealInMenuService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MealInMenuServiceImpl implements MealInMenuService {
    private final MealInMenuEntityRepository mealInMenuEntityRepository;
    private final ModelMapper modelMapper;

    public MealInMenuServiceImpl(MealInMenuEntityRepository mealInMenuEntityRepository, ModelMapper modelMapper) {
        this.mealInMenuEntityRepository = mealInMenuEntityRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Set<MealInMenu> findAll() {
        return mealInMenuEntityRepository.findAll().stream().map(m -> modelMapper.map(m, MealInMenu.class)).collect(Collectors.toSet());
    }
}
