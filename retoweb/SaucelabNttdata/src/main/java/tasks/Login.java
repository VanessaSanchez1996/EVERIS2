package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeLogin.*;

public class Login implements Task {

    private String user;
    private String password;

    public Login(String user, String password){
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(INPUT_USER),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }

    public static Login realizarLogin(String user, String password) {
        return instrumented(Login.class, user, password);
    }

}
