package co.com.choucair.certification.CEQS_RetoTecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import java.nio.file.Path;
import java.util.Map;
import static co.com.choucair.certification.CEQS_RetoTecnico.userinterface.PaginaAñadirCandidato.*;
import static co.com.choucair.certification.CEQS_RetoTecnico.userinterface.PaginaPerfilCandidato.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LlenarFormulario implements Task {

    public static Map<String, String> infocandidato;

    public static  LlenarFormulario Formulario (Map<String, String> info_candidato) {
        infocandidato = info_candidato;
        return Tasks.instrumented(LlenarFormulario.class, info_candidato);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        Path fileToUpload = Path.of("/Reto_Tecnico_Choucair/co.com.choucair.certification.CEQS_RetoTecnico/src/main/resources/CV_Leo_Di_Caprio.pdf");

        actor.attemptsTo(
                Enter.theValue(infocandidato.get("nombre")).into(FIRST_NAME),
                Enter.theValue(infocandidato.get("segundo_nombre")).into(MIDDLE_NAME),
                Enter.theValue(infocandidato.get("apellido")).into(LAST_NAME),
                Click.on(VACANTE),
                Hit.the(Keys.ARROW_DOWN).into(VACANTE),
                Upload.theFile(fileToUpload).to(CV),
                Hit.the(Keys.ENTER).into(VACANTE),
                Enter.theValue(infocandidato.get("email")).into(EMAIL),
                Enter.theValue(infocandidato.get("numero_de_contacto")).into(NUMERO_DE_CONTACTO),
                Enter.theValue(infocandidato.get("palabras_clave")).into(PALABRAS_CLAVE),
                Enter.theValue(infocandidato.get("notas")).into(NOTAS),
                Click.on(CHECK_BTN),
                Click.on(SAVE_BTN),
                WaitUntil.the(SL_BTN, isVisible()));
    }
}
