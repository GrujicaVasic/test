package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.models.dto.Measures;
import is.nutritivna_zona.models.entities.MeasureEntity;
import is.nutritivna_zona.repositories.MeasuresEntityRepository;
import is.nutritivna_zona.services.MeasuresService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MeasuresServiceImpl extends CrudJpaService<MeasureEntity, Integer> implements MeasuresService {
    private final ModelMapper modelMapper;
    private final MeasuresEntityRepository measuresEntityRepository;


    public MeasuresServiceImpl(ModelMapper modelMapper, MeasuresEntityRepository measuresEntityRepository) {
        super(measuresEntityRepository, modelMapper, MeasureEntity.class);
        this.modelMapper = modelMapper;
        this.measuresEntityRepository = measuresEntityRepository;
    }

    @Override
    public List<Measures> getAllMeasuresByUserId(Integer userId) {
        return measuresEntityRepository.getAllByUser_Id(userId).stream().map(m -> modelMapper.map(m, Measures.class)).collect(Collectors.toList());
    }
}
