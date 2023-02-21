package login;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class LoginTest {

    @Test
    public void standardLoginTest() {
        open("https://www.saucedemo.com/");

        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");

        $("#login-button").click();
        sleep(5000);

        $(".title").shouldHave(Condition.text("Products"));
    }
}
