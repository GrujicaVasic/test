package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.models.dto.Measures;

import java.util.List;

public interface MeasuresService extends CrudService<Integer> {
    List<Measures> getAllMeasuresByUserId(Integer userId);
}
