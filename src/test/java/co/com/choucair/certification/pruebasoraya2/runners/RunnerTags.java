package co.com.choucair.certification.pruebasoraya2.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/usuario.feature",
                                tags = "@stories",
                                glue = "co.com.choucair.certification.pruebasoraya2.stepdefinitions",
                                snippets = SnippetType.CAMELCASE)

        public class RunnerTags {

}
