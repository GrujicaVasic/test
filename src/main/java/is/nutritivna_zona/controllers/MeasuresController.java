package is.nutritivna_zona.controllers;

import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.models.dto.Measures;
import is.nutritivna_zona.models.requests.MeasuresRequest;
import is.nutritivna_zona.repositories.MeasuresEntityRepository;
import is.nutritivna_zona.services.MeasuresService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measures")
public class MeasuresController extends CrudController<Integer, MeasuresRequest, Measures> {
    public MeasuresController(MeasuresService service) {
        super(service, Measures.class);
    }

//    private final MeasuresService measuresService;

//    public MeasuresController(MeasuresService measuresService) {
//        this.measuresService = measuresService;
//    }

//    @GetMapping
//    public List<Measures> findAll() {
//        return measuresService.findAll(Measures.class);
//    }
//
//    @GetMapping("/{id}")
//    public Measures findById(@PathVariable Integer id) {
//        return measuresService.findById(id, Measures.class);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteById(@PathVariable Integer id) {
//        measuresService.delete(id);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Measures insert(@RequestBody MeasuresRequest measuresRequest) {
//        return measuresService.insert(measuresRequest, Measures.class);
//    }
}
