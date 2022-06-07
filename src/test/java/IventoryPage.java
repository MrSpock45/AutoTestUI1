import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
public class IventoryPage {

    private String titleXpath="//*[@id=\"header_container\"]/div[2]/span";
    private String logOutMenuId="react-burger-menu-btn";
    private String logOutBtnId="logout_sidebar_link";


    @BeforeTest
    public void IventoryPage()
    {

    }

    @Test
    public void checkLogin()
    {
        $(By.xpath(titleXpath)).shouldHave(Condition.exactText("PRODUCTS"));
    }

    @Test
    public void logout()
    {
        $(By.id(logOutMenuId)).click();
        // $(By.id(logOutMenuId)).shouldBe(C)
        $(By.id(logOutBtnId)).click();

    }
}
