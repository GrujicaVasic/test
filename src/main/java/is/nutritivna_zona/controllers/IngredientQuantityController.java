package is.nutritivna_zona.controllers;

import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.models.dto.IngredientQuantity;
import is.nutritivna_zona.models.requests.IngredientQuantityRequest;
import is.nutritivna_zona.services.IngredientQuantityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quantities")
public class IngredientQuantityController extends CrudController<Integer, IngredientQuantityRequest, IngredientQuantity> {

    public IngredientQuantityController(IngredientQuantityService service) {
        super(service, IngredientQuantity.class);
    }
}
