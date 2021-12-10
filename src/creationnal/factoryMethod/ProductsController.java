package creationnal.factoryMethod;

import creationnal.factoryMethod.matcha.Controller;
import creationnal.factoryMethod.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        Map<String, Object> context = new HashMap<>();

        render("products.html", context, new MatchaViewEngine());
    }
}
