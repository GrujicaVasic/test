package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.models.Symptom;
import is.nutritivna_zona.repositories.SymptomEntityRepository;
import is.nutritivna_zona.services.SymptomService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SymptomServiceImpl implements SymptomService {
    private final ModelMapper modelMapper;
    private final SymptomEntityRepository repository;

    public SymptomServiceImpl(ModelMapper modelMapper, SymptomEntityRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    @Override
    public Set<Symptom> findAll() {
        return repository.findAll().stream().map(s -> modelMapper.map(s, Symptom.class)).collect(Collectors.toSet());
    }

    @Override
    public Symptom findById(Integer id) {
        return modelMapper.map(repository.findById(id), Symptom.class);
    }
}
