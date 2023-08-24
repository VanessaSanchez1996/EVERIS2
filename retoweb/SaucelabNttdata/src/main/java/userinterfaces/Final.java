package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class Final extends PageObject {

    public static final Target MENSAJE_FINAL = Target.the("Compra finalizada").locatedBy("//h2[contains(text(),'Thank you for your order')]");

}
