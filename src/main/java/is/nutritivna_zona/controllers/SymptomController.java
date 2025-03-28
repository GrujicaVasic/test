package is.nutritivna_zona.controllers;

import is.nutritivna_zona.models.Symptom;
import is.nutritivna_zona.services.SymptomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/symptoms")
public class SymptomController {
    private final SymptomService symptomService;

    public SymptomController(SymptomService symptomService) {
        this.symptomService = symptomService;
    }

    @GetMapping
    public Set<Symptom> findAll() {
        return symptomService.findAll();
    }

    @GetMapping("/{id}")
    public Symptom findById(@PathVariable Integer id) {
        return symptomService.findById(id);
    }
}
