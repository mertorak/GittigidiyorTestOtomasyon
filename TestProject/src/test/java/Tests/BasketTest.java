package Tests;

import PageModel.BasketModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketTest {

    BasketModel basketModel = new BasketModel();

    @Step("Adet arttirilarak urun adedinin 2 oldugu dogrulanir")
    public void checkIfAmount(){

        basketModel.selectedAmount();
        Assert.assertEquals("2",basketModel.checkIfAmount());
    }

    @Step("Urun sepetten silinerek sepetin bos oldugu kontrol ettirilir")
    public void SearchProduct(){

        basketModel.clickDelete();
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır.",basketModel.checkIfMessage());

    }
}
