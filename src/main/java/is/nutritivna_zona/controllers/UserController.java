package is.nutritivna_zona.controllers;

import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.FoodDiary;
import is.nutritivna_zona.models.User;
import is.nutritivna_zona.models.UserFull;
import is.nutritivna_zona.models.dto.Measures;
import is.nutritivna_zona.models.dto.QuestionnaireAnswer;
import is.nutritivna_zona.models.requests.UserRequest;
import is.nutritivna_zona.services.FoodDiaryService;
import is.nutritivna_zona.services.MeasuresService;
import is.nutritivna_zona.services.QuestionnaireAnswerService;
import is.nutritivna_zona.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final FoodDiaryService foodDiaryService;
    private final MeasuresService measuresService;
    private final QuestionnaireAnswerService questionnaireAnswerService;

    public UserController(UserService userService, FoodDiaryService foodDiaryService, MeasuresService measuresService, QuestionnaireAnswerService questionnaireAnswerService) {
        this.userService = userService;
        this.foodDiaryService = foodDiaryService;
        this.measuresService = measuresService;
        this.questionnaireAnswerService = questionnaireAnswerService;
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable int id) throws NotFoundException {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userService.delete(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User insert(@RequestBody UserRequest userRequest) throws NotFoundException {
        return userService.insert(userRequest);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable int id, @RequestBody UserRequest userRequest) throws NotFoundException {
        return userService.update(id, userRequest);
    }

    @GetMapping("/full")
    public List<UserFull> findAllQuestionnaires() {
        return userService.findAllFull();
    }

    @GetMapping("/{id}/diaries")
    public List<FoodDiary> getAllDiariesByClientId(@PathVariable Integer id) {
        return foodDiaryService.getAllDiariesByClientId(id);
    }
    @GetMapping("/{id}/measures")
    public List<Measures> getAllMeasures(@PathVariable Integer id) {
        return measuresService.getAllMeasuresByUserId(id);
    }

    @GetMapping("/{id}/questionnaire_answers")
    public List<QuestionnaireAnswer> getAllQuestionnaireAnswers(@PathVariable Integer id) {
        return questionnaireAnswerService.getAllQuestionnaireAnswersByClientId(id);
    }

}
