import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddFrends {

    @Before
    public void start(){
        Configuration.browser = "chrome";
    }


    @Test
    public void AddFrends() {
        (new Authorization()).authorization();
        $(By.id("mynetwork-tab-icon")).click();
        $(By.className(ClassName.BUTTON_NEW_FREND)).click();
        $(By.className(ClassName.BUTTON_NEW_FREND)).click();
        $(By.className(ClassName.BUTTON_NEW_FREND)).click();
        $(By.className(ClassName.BUTTON_NEW_FREND)).click();
        $(By.className(ClassName.BUTTON_CANCLE_FREND)).click();
        $(By.className(ClassName.BUTTON_CANCLE_FREND)).click();

    }
}
