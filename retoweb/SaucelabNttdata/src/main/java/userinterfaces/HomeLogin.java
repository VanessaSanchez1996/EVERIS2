package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class HomeLogin extends PageObject {

    public static final Target INPUT_USER = Target.the("Input donde se ingresa el usuario").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Input donde se ingresa el password").located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("Input donde se da click al boton login").located(By.id("login-button"));

}
