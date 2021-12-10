package creationnal.factoryMethod.sharp;

import creationnal.factoryMethod.matcha.Controller;
import creationnal.factoryMethod.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
