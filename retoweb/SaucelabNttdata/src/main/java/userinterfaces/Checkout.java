package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class Checkout extends PageObject {

    public static final Target INPUT_NOMBRE = Target.the("Datos para el checkout").located(By.id("first-name"));
    public static final Target INPUT_APELLIDO = Target.the("Datos para el checkout").located(By.id("last-name"));
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Datos para el checkout").located(By.id("postal-code"));
    public static final Target BOTON_CONTINUE = Target.the("Datos para el checkout").located(By.id("continue"));

}
