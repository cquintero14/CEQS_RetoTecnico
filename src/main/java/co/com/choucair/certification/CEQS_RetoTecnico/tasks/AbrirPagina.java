package co.com.choucair.certification.CEQS_RetoTecnico.tasks;

import co.com.choucair.certification.CEQS_RetoTecnico.userinterface.PaginaIniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    private PaginaIniciarSesion paginaInicio;
    public static AbrirPagina urlApp() { return Tasks.instrumented(AbrirPagina.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(paginaInicio));}

}
