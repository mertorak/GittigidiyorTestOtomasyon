package Tests;

import PageModel.LoginModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class LoginTest {
    LoginModel loginModel = new LoginModel();

    @Step("Siteye Login olunur")
    public void LoginPage(){
        loginModel.clickUserMenu();
        loginModel.clickLogin();
        Assert.assertTrue(loginModel.chekIfLoginPage());
        loginModel.setUserName("testotomasyon@gmail.com");
        loginModel.setPassword("Testotomasyon11.");
        loginModel.clickLoginUser();

    }

    @Step("Login islemi kontrol edilir")
    public void chekIfOpenPage(){
        Assert.assertTrue(loginModel.checkIfMyUserMenu());
    }

}
