package is.nutritivna_zona.services;

import is.nutritivna_zona.models.Symptom;

import java.util.Set;

public interface SymptomService {
    Set<Symptom> findAll();
    Symptom findById(Integer id);
}
