package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class Carrito extends PageObject {

    public static final Target BOTON_CHECKOUT = Target.the("Opción para realizar checkout").located(By.id("checkout"));

}
