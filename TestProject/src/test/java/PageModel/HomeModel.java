package PageModel;

import org.openqa.selenium.By;

public class HomeModel extends BaseModel {

    public static By tdOldHeader = By.className("main-header");

    public void userVisitSite(String url){
        webDriver.get(url);
    }

    public boolean chekIfOpenPage() {
        return displayed(tdOldHeader);
    }

}
