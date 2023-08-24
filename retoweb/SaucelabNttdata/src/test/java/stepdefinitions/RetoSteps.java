package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.SelectProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.MostrarMensaje;
import tasks.LlenarFormulario;
import tasks.Login;
import userinterfaces.HomeLogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static userinterfaces.Carrito.BOTON_CHECKOUT;
import static userinterfaces.Checkout.BOTON_CONTINUE;
import static userinterfaces.Final.MENSAJE_FINAL;
import static userinterfaces.HomeLogin.BUTTON_LOGIN;
import static userinterfaces.Overview.BOTON_FINISH;
import static userinterfaces.Productos.ICONO_CARRITO;
import static userinterfaces.Productos.LISTADO_PRODUCTOS;

public class RetoSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Kath");
    private HomeLogin homelogin = new HomeLogin();

    @Given("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homelogin));
    }

    @When("^el ingresa su (.*) y (.*)$")
    public void elIngresaSuUserYPassword(String user, String password) {
        actor.wasAbleTo(
                Login.realizarLogin(user, password)
        );
    }

    @And("^el da click en Login$")
    public void elDaClickEnLogin() {
        actor.attemptsTo(Click.on(BUTTON_LOGIN));
    }

    @And("^el agrega la cantidad (.*) de productos al carrito$")
    public void elAgregaLaCantidadCantidadDeProductosAlCarrito(String cantidad) {
        actor.wasAbleTo(
                SelectProducts.elegirCantidadProductos(LISTADO_PRODUCTOS,cantidad)
        );
    }

    @Then("^el ve los productos listados en el carro de compras$")
    public void elVeLosProductosListadosEnElCarroDeCompras() {
        actor.attemptsTo(Click.on(ICONO_CARRITO));
    }

    @And("^el da click en Checkout$")
    public void elDaClickEnCheckout() {
        actor.attemptsTo(Click.on(BOTON_CHECKOUT));
    }

    @And("^el completa el formulario con los datos (.*), (.*) y (.*)$")
    public void elCompletaElFormularioConLosDatosNombreApellidoYPostal(String nombre, String apellido, String codigoPostal) {
        actor.wasAbleTo(
                LlenarFormulario.cantidad(nombre,apellido,codigoPostal)
        );
    }

    @And("^el da click en Continue$")
    public void elDaClickEnContinue() {
        actor.attemptsTo(Click.on(BOTON_CONTINUE));
    }

    @And("^el da click en Finish$")
    public void elDaClickEnFinish() {
        actor.attemptsTo(Click.on(BOTON_FINISH));
    }

    @Then("^el visualiza el mensaje de confirmacion (.*)$")
    public void elVisualizaElMensajeDeConfirmacionMensaje(String mensaje) {
        actor.should(seeThat(MostrarMensaje.mensajeMostrado(MENSAJE_FINAL), containsString(mensaje.toUpperCase())));

    }
}
