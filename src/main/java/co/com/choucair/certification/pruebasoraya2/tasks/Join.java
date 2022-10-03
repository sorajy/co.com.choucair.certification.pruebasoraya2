package co.com.choucair.certification.pruebasoraya2.tasks;

import co.com.choucair.certification.pruebasoraya2.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Join implements Task {
    public static Join onThePage()

    {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(UtestJoinPage.JOIN_BUTTON),
            Enter.theValue("Enteryourname").into(UtestJoinPage.INPUT_FIRSTNAME),
            Enter.theValue("Enteryourlastname").into(UtestJoinPage.INPUT_LASTNAME),
            Enter.theValue("jsmith@example.com").into(UtestJoinPage.INPUT_MAIL),
            Enter.theValue("Enteryourbirthmonth").into(UtestJoinPage.INPUT_BIRTHMONTH),
            Enter.theValue("10").into(UtestJoinPage.INPUT_BIRTHDAY),
            Enter.theValue("1986").into(UtestJoinPage.INPUT_BIRTHYEAR),
            Enter.theValue("yourlanguage").into(UtestJoinPage.INPUT_LANGUAGE),
            Enter.theValue("Enteryourcity").into(UtestJoinPage.INPUT_CITY),
            Enter.theValue("0500").into(UtestJoinPage.INPUT_POSTALCODE),
            Enter.theValue("Enteryourcountry").into(UtestJoinPage.INPUT_COUNTRY),
            Enter.theValue("Enteryourcomputer").into(UtestJoinPage.INPUT_COMPUTER),
            Enter.theValue("version").into(UtestJoinPage.INPUT_VERSION),
            Enter.theValue("MobileDevice").into(UtestJoinPage.INPUT_MOBILE),
            Enter.theValue("ModelDevice").into(UtestJoinPage.INPUT_MODEL),
            Enter.theValue("Os").into(UtestJoinPage.INPUT_SO),
            Enter.theValue("EnterYourPasswd").into(UtestJoinPage.INPUT_PASSWD),
            Enter.theValue("ConfirmYourPasswd").into(UtestJoinPage.INPUT_CONFIRMPASSWD),
            //Check.whether("").
            Click.on(UtestJoinPage.ENTER_BUTTON)
    );
    }
}
