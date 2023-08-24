package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;


public class Productos extends PageObject {

    public static final Target LISTADO_PRODUCTOS = Target.the("Listado de productos").locatedBy("//button[@class='btn btn_primary btn_small btn_inventory']");
    public static final Target ICONO_CARRITO = Target.the("Input donde se ingresa el password").locatedBy("//div[@id='shopping_cart_container']");

}
