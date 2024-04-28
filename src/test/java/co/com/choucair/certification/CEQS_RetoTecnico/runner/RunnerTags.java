package co.com.choucair.certification.CEQS_RetoTecnico.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features =  {
        "src/test/resources/features/first.feature"
        },
        glue = "co.com.choucair.certification.CEQS_RetoTecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {

}
