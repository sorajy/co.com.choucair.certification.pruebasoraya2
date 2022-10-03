package co.com.choucair.certification.pruebasoraya2.stepdefinitions;

import co.com.choucair.certification.pruebasoraya2.tasks.Join;
import co.com.choucair.certification.pruebasoraya2.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than carlitos wants to register on the Utest website$")
    public void thanCarlitosWantsToRegisterOnTheUtestWebsite() {
        OnStage.theActorCalled("Carlitos").wasAbleTo(OpenUp.thePage(), (Join.onThePage()));
    }

    @Then("^fill out the registration form to create new user$")
    public void fillOutTheRegistrationFormToCreateNewUser() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
