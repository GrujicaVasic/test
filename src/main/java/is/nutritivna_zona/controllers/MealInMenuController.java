package is.nutritivna_zona.controllers;

import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.models.dto.MealInMenu;
import is.nutritivna_zona.models.requests.MealInMenuRequest;
import is.nutritivna_zona.services.MealInMenuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu-meals")
public class MealInMenuController extends CrudController<Integer, MealInMenuRequest, MealInMenu> {

    public MealInMenuController(MealInMenuService mealInMenuService) {
        super(mealInMenuService, MealInMenu.class);
    }

}
