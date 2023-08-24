package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class MostrarMensaje implements Question<String> {
    private final Target target;

    public MostrarMensaje(Target target) {
        this.target = target;
    }

    public static Question<String> mensajeMostrado(Target target){
        return actor -> target.resolveFor(actor).getText().toUpperCase();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
