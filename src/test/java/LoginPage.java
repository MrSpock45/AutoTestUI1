import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private String login="user-name";//id
    private String paswwsord="password";//id
    private String btnLogin="login-button";//id

    private String userLogin;//передаваемый параметр в


    public LoginPage()
    {

    }

    @Test
    public void login(String userLogin, String userPassword)
    {
        Selenide.open("https://www.saucedemo.com/");
        $(By.id(login)).setValue(userLogin);
        $(By.id(paswwsord)).setValue(userPassword);
        $(By.id(btnLogin)).click();

    }

    @Test
    public void afterLogout()
    {
        $(By.id(btnLogin)).should(Condition.exactValue("Login"));

        try
        {
            Thread.sleep(5000);
        }
        catch (Exception exp)
        {

        }

    }
}
