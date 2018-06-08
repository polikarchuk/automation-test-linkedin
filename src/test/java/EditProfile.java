import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EditProfile {
    @Before
    public void start(){
        Configuration.browser = "chrome";
    }

    @Test
    public void EditProfile() {
        (new Authorization()).authorization();
        $(By.linkText(LinkText.EDITE_PROFILE)).click();
        $(By.className(ClassName.EDITE_PROFILE_CLICK)).click();
        $(By.id(IdNameInput.EDITE_FIRSTNAME)).click();
        $(By.id(IdNameInput.EDITE_FIRSTNAME)).clear();
        $(By.id(IdNameInput.EDITE_FIRSTNAME)).sendKeys("automation");
        $(By.id(IdNameInput.EDITE_LASTNAME)).click();
        $(By.id(IdNameInput.EDITE_LASTNAME)).clear();
        $(By.id(IdNameInput.EDITE_LASTNAME)).sendKeys("automation");
        $(By.id(IdNameInput.EDITE_HEADLINE)).click();
        $(By.id(IdNameInput.EDITE_HEADLINE)).clear();
        $(By.id(IdNameInput.EDITE_HEADLINE)).sendKeys("QA Engineer automation");
        $(By.id(IdNameInput.EDITE_COUNTRY)).click();
        $(By.xpath("//option[@value='ua']")).click();
        $(By.id(IdNameInput.EDITE_ZIPCODE)).click();
        $(By.id(IdNameInput.EDITE_ZIPCODE)).click();
        $(By.id(IdNameInput.EDITE_ZIPCODE)).selectOption("Интернет-технологии");
        $(By.xpath(Xpath.SAVE_BUTTON)).click();


    }
}
