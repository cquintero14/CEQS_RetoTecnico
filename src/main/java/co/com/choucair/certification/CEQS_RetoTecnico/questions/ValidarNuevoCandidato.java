package co.com.choucair.certification.CEQS_RetoTecnico.questions;

import static co.com.choucair.certification.CEQS_RetoTecnico.userinterface.PaginaPerfilCandidato.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;



public class ValidarNuevoCandidato implements Question{
    public static ValidarNuevoCandidato validar_candidato (){

        return new ValidarNuevoCandidato ();

    }


    @Override
    public  Object answeredBy(Actor actor) {

        return actor.asksFor(Text.of(V_FIRST_NAME));
    }
}
