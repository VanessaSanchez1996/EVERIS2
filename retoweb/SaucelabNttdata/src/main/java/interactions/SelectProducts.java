package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProducts implements Interaction {

	private final String cantidad;
	private final Target target;

	public SelectProducts(Target target, String cantidad) {
		this.target=target;
		this.cantidad = cantidad;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		List<WebElementFacade> elementList = target.resolveAllFor(actor);
		int cant = Integer.parseInt(cantidad);
		int i=1;
		for (WebElementFacade elementFacade : elementList) {
			elementFacade.click();
			if (i==cant) {
				break;
			}
			i++;
		}
	}
	public static SelectProducts elegirCantidadProductos(Target target, String cantidad) {
		return instrumented(SelectProducts.class,target, cantidad);
	}
}
