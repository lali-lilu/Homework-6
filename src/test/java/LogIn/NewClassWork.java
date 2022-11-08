package LogIn;

import ChromRunner.Chrom;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class NewClassWork extends Chrom{
    @Test
    public void FirstTests(){
String mail="lali_lilu5@yahoo.com",
       pass="123456789";
SelenideElement  singin = $(".sign-in"),
        adress=$(byName("email")),
        password=$(byName("password")),
        repassword=$(byName("password_repeat")),
        registration=$(".auth__button");
        singin .click();
        adress.setValue(mail);
        password.setValue(pass);
        repassword.setValue("123456789");
        registration.shouldBe(Condition.visible);

        Assert.assertEquals(adress.getValue(),mail,"sing in good");
        Assert.assertTrue(registration.is(Condition.visible));
sleep(5000);


        
    }
}
