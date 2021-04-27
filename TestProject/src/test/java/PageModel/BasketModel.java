package PageModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import javax.swing.*;
import java.util.List;

public class BasketModel extends BaseModel {

    JComboBox j ;

    public List<WebElement> amounts;

    public static By selectAmount = By.className("amount");

    public static By emptyBasketMessage = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div/div[2]/h2");

    public static By btnDeleteProductBasket = By.className("gg-icon gg-icon-bin-medium");

    public void selectedAmount(){
        clickElement(selectAmount);
        amounts = findElements(selectAmount);
        for (int i=0;i<amounts.size();i++){
            if (amounts.get(i).getText().equals("2"))
            {
                j.setSelectedIndex(i);
            }
        }
    }

    public String checkIfAmount(){
       return getAttribute(selectAmount, "value");
    }

    public void clickDelete(){
       clickElement(btnDeleteProductBasket);
    }

    public String checkIfMessage(){
       return getText(emptyBasketMessage);
    }

}
