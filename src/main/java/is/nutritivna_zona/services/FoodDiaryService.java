package is.nutritivna_zona.services;

import is.nutritivna_zona.models.FoodDiary;

import java.util.List;
import java.util.Set;


public interface FoodDiaryService {
    List<FoodDiary> findAll();
    List<FoodDiary> getAllDiariesByClientId(Integer id);
}
