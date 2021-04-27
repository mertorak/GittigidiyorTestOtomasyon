package PageModel;

import org.openqa.selenium.By;

public class LoginModel extends BaseModel {

    public static By hdUserMenu = By.className("gekhq4-6 hnYHyk");

    public static By btnLogin = By.className("sc-3wdx43-0 bAxXdY");

    public static By hdLogin = By.className("gg-login-head");

    public static By txtUserName = By.id("L-UserNameField");

    public static By txtPassword = By.id("L-PasswordField");

    public static By btnLoginUser = By.id("gg-login-enter");

    public static By tdMyUserMenu = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[3]/div/div[1]/div/div[2]/span");

    public void clickUserMenu() {
        clickElement(hdUserMenu);
    }

    public void clickLogin() {
        clickElement(btnLogin);
    }

    public boolean chekIfLoginPage() {
        return displayed(hdLogin);
    }

    public void setUserName(String name) {
        sendKeys(txtUserName, name);
    }

    public void setPassword(String surname) {
        sendKeys(txtPassword, surname);
    }

    public void clickLoginUser() {
        clickElement(btnLoginUser);
    }

    public boolean checkIfMyUserMenu() {
        return displayed(tdMyUserMenu );
    }


}
