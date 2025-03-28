package is.nutritivna_zona.controllers;

import is.nutritivna_zona.models.dto.QuestionnaireAnswer;
import is.nutritivna_zona.services.QuestionnaireAnswerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/answers")
public class QuestionnaireAnswerController {
    private final QuestionnaireAnswerService questionnaireAnswerService;

    public QuestionnaireAnswerController(QuestionnaireAnswerService questionnaireAnswerService) {
        this.questionnaireAnswerService = questionnaireAnswerService;
    }

    @GetMapping
    public List<QuestionnaireAnswer> findAll() {
        return questionnaireAnswerService.findAll();
    }
}
