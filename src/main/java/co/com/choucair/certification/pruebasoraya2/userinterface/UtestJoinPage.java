package co.com.choucair.certification.pruebasoraya2.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestJoinPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to join")
            .located(By.id("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FIRSTNAME =Target.the("where do we write the firstname").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME =Target.the("where do we write the lastname").located(By.id("lastName"));
    public static final Target INPUT_MAIL =Target.the("where do we write the email").located(By.id("email"));
    public static final Target INPUT_BIRTHMONTH =Target.the("where do we select the date of birthmonth").located(By.id("birthMonth"));
    public static final Target INPUT_BIRTHDAY =Target.the("where do we select the date of birthday").located(By.id("birthDay"));
    public static final Target INPUT_BIRTHYEAR =Target.the("where do we select the date of birthyear").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE =Target.the("where do we write the language").located(By.id("languages"));
    public static final Target INPUT_CITY =Target.the("where do we select the city").located(By.id("city"));
    public static final Target INPUT_POSTALCODE =Target.the("where do we write the postal code").located(By.id("zip"));
    public static final Target INPUT_COUNTRY =Target.the("where do we select the country").located(By.id("regs_container"));
    public static final Target INPUT_COMPUTER =Target.the("where do we select the computer").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_VERSION =Target.the("where do we select the operating system version").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_LANGUAGE2 =Target.the("where do we select the language").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target INPUT_MOBILE =Target.the("where do we select the mobile device").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_MODEL =Target.the("where do we select the mobile device model").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_SO =Target.the("where do we select the operating system").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target INPUT_PASSWD =Target.the("where do we create the password").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWD =Target.the("where do we confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS =Target.the("where do we check the terms").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target ENTER_BUTTON = Target.the("button that shows us the complete the form")
            .located(By.id("laddaBtn"));
}
