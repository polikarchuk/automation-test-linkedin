import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Authorization {
    @Before
    public void start(){
        Configuration.browser = "chrome";
    }

    @Test
    public void authorization() {
        open("https://www.linkedin.com");
        $(By.cssSelector("input[type=text]")).setValue("polikarchuk.o@i.ua");
        $(By.cssSelector("input[type=password]")).setValue("neon7174360");
        $(By.className("submit-button")).click();
    }
}
