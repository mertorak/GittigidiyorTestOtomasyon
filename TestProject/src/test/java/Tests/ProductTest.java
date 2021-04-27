package Tests;

import PageModel.ProductModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductTest {
    ProductModel productModel = new ProductModel();


    @Step("Arama yerine bilgisayar girilir")
    public void SearchProduct(){

    productModel.clickSearchBox();
    productModel.setTextSearchBox("bilgisayar");
    productModel.clickSearch();
    }

    @Step("Arama sonuclari sayfasindan 2.sayfa acilir")
    public void ClickSecondPage(){
    productModel.clickSecondPage();
     }

    @Step("2.sayfanin acildigi kontrol edilir")
    public void CheckIfSecondPage(){
        Assert.assertTrue(productModel.checkIfSecondPage());
    }

    @Step("Sonuca gore sergilenen urunlerden rastgele bir urun secilir")
    public void ClickSelectRandomProduct(){
        productModel.clickSelectRandomProduct();
    }
    @Step("Secilen urun sepete eklenir")
    public void ClickBasketAdd(){
        productModel.clickBasketAdd();
    }

    @Step("Urun sayfasindaki fiyat ile sepette yer alan urun fiyatinin dogrulugu karsilastirilir")
    public void chekIfProductPrice(){
        productModel.clickBasket();
        Assert.assertEquals("Odeme tutarlari uyusmamaktadir",productModel.firstProductPrice,productModel.secondPrice());
    }

}
