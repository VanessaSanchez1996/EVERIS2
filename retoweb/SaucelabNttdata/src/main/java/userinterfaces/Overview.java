package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class Overview extends PageObject {

    public static final Target BOTON_FINISH = Target.the("Vista general del checkout previo a la finalización de la compra").located(By.id("finish"));

}
