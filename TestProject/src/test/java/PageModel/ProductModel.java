package PageModel;

import org.openqa.selenium.By;

public class ProductModel extends BaseModel {

    public  String firstProductPrice;

    public static By searchBox = By.className("sc-4995aq-0 sc-14oyvky-0 itMXHg");

    public static By btnSecondPage = By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[5]/ul/li[2]/a");

    public static By secondPage = By.cssSelector("#best-match-right > div.pager.pt30.hidden-m.gg-d-24 > ul > li.selected > a");

    public static By selectRandomProduct = By.xpath("/html/body/div[5]/div[1]/div/div[2]/div[3]/div[2]/ul/li[1]");

    public static By btnAddBasket = By.id("add-to-basket");

    public static By btnSearch = By.id("header-search-find-link");

    public static By btnBasket = By.className("header-cart-container robot-header-cart-container hidden");

    public static By productPrice = By.xpath("/html/body/div[5]/div[1]/div/div[2]/div[4]/div[2]/ul/li[1]/a/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/p");

    public static By secondPrice = By.className("real-discounted-price");


    public void clickSearchBox() {
        clickElement(searchBox);
    }

    public void setTextSearchBox(String productName) {
        sendKeys(searchBox, productName);
    }

    public void clickSecondPage() {
       clickElement(btnSecondPage);
    }

    public boolean checkIfSecondPage() {
        return displayed(secondPage);
    }

    public void clickSelectRandomProduct() {
        firstProductPrice = getText(productPrice);
        clickElement(selectRandomProduct);
    }

    public void clickBasketAdd() {
        clickElement(btnAddBasket);
    }

    public void clickSearch() {
        clickElement(btnSearch);
    }

    public void clickBasket() {
       clickElement(btnBasket);
    }

    public String secondPrice() {
       return getText(secondPrice);
    }

}
