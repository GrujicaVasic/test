package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.models.FoodDiary;
import is.nutritivna_zona.repositories.FoodDiaryEntityRepository;
import is.nutritivna_zona.services.FoodDiaryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodDiaryServiceImpl implements FoodDiaryService {
    private final ModelMapper modelMapper;
    private final FoodDiaryEntityRepository foodDiaryEntityRepository;

    public FoodDiaryServiceImpl(ModelMapper modelMapper, FoodDiaryEntityRepository foodDiaryEntityRepository) {
        this.modelMapper = modelMapper;
        this.foodDiaryEntityRepository = foodDiaryEntityRepository;
    }

    @Override
    public List<FoodDiary> findAll() {
        return foodDiaryEntityRepository.findAll().stream().map(fd -> modelMapper.map(fd, FoodDiary.class)).collect(Collectors.toList());
    }

    @Override
    public List<FoodDiary> getAllDiariesByClientId(Integer id) {
        return foodDiaryEntityRepository.getAllByUser_Id(id).stream().map(fd -> modelMapper.map(fd, FoodDiary.class)).collect(Collectors.toList());
    }
}
