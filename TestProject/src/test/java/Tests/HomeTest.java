package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class HomeTest {

    HomeModel homeModel = new HomeModel();

    @Step("<key> sayfası açılır")
    public void userVisitSite(String key){
        homeModel.userVisitSite(key);
    }

    @Step("Gittigidiyor sayfasının açıldığı görülür")
    public void chekIfOpenPage(){
        Assert.assertTrue(homeModel.chekIfOpenPage());
    }

}
