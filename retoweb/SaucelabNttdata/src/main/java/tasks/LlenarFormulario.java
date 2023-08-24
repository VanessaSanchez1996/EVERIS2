package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.Checkout.*;

public class LlenarFormulario implements Task {

    private String nombre;
    private String apellido;
    private String postal;

    public LlenarFormulario(String nombre, String apellido, String postal){
        this.nombre = nombre;
        this.apellido = apellido;
        this.postal = postal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(INPUT_NOMBRE),
                Enter.theValue(apellido).into(INPUT_APELLIDO),
                Enter.theValue(postal).into(INPUT_CODIGO_POSTAL)
        );
    }



    public static LlenarFormulario cantidad(String nombre, String apellido, String postal) {
        return instrumented(LlenarFormulario.class,nombre, apellido, postal);
    }

}
