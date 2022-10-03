package co.com.choucair.certification.pruebasoraya2.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(), 'Recursos Automatizacion Bancolombia')]"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.id("//button[@class='btn btn-secundary']"));
    public static final Target SELECT_COURSE= Target.the("Da click para buscar el curso")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));

    public static class UtestJoinPage extends PageObject {
        public static final Target JOIN_BUTTON = Target.the("button that shows us the form to join")
                .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Join Today')]"));
        public static final Target INPUT_FIRSTNAME =Target.the("where do we write the firstname").located(By.id("firstname"));
        public static final Target INPUT_LASTNAME =Target.the("where do we write the lastname").located(By.id("lastname"));
        public static final Target INPUT_MAIL =Target.the("where do we write the email").located(By.id("email"));
        public static final Target SELECT_DATE =Target.the("where do we select the date of birth").located(By.xpath("//div[@class='d-none d-lg-block']"));
        public static final Target SELECT_CITY =Target.the("where do we select the city").located(By.xpath("//div[@class='d-none d-lg-block']"));
        public static final Target INPUT_POSTALCODE =Target.the("where do we write the postal code").located(By.id("postalcode"));
        public static final Target SELECT_COMPUTER =Target.the("where do we select the computer").located(By.xpath("//div[@class='d-none d-lg-block']"));
        public static final Target SELECT_VERSION =Target.the("where do we select the operating system version").located(By.xpath("//div[@class='d-none d-lg-block']"));
        public static final Target SELECT_LANGUAGE =Target.the("where do we select the language").located(By.xpath("//div[@class='d-none d-lg-block']"));
        public static final Target SELECT_MOBILE =Target.the("where do we select the mobile device").located(By.xpath("//div[@class='d-none d-lg-block']"));
        public static final Target SELECT_MODEL =Target.the("where do we select the mobile device model").located(By.xpath("//div[@class='d-none d-lg-block']"));
        public static final Target SELECT_SO =Target.the("where do we select the operating system").located(By.xpath("//div[@class='d-none d-lg-block']"));
        public static final Target INPUT_PASSWD =Target.the("where do we create the password").located(By.id("password"));
        public static final Target INPUT_CONFIRMPASSWD =Target.the("where do we confirm the password").located(By.id("confirmpassword"));
        public static final Target CHECK_TERMS =Target.the("where do we check the terms").located(By.id("terms"));
        public static final Target COMPLETE_BUTTON = Target.the("button that shows us the complete the form")
                .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Complete setup')]"));
    }
}
