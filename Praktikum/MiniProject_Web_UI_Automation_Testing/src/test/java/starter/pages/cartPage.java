package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class cartPage extends PageObject {
    private By cartButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");
    }

    private By productInCartTitle(){
        return By.xpath("//div[@class='v-list-item__title label-name']");
    }

    private By plusIcon(){
        return By.xpath("//span[text()='+']");
    }

    private By minIcon(){
        return By.xpath("//span[text()='-']");
    }

    private By quantityProduct(){
        return By.id("label-total-quantity");
    }

    private By productEmptyTitle(){
        return By.xpath("//div[@role='alert']");
    }

    private By bayarButton(){
        return By.xpath("//span[text()=' Bayar ']");
    }

    @Step
    public void clickCartButton(){
        $(cartButton()).click();
    }

    @Step
    public void seeProductInCart(){
        $(productInCartTitle()).isDisplayed();
    }

    @Step
    public void onCartPage(){
        $(productInCartTitle()).isDisplayed();
    }

    @Step
    public void clickPlusIcon(){
        $(plusIcon()).click();
    }
    @Step
    public void clickMinIcon(){
        $(minIcon()).click();
    }

    @Step
    public void seeQuantityProduct(){
        $(quantityProduct()).isDisplayed();
    }

    @Step
    public void seeProductEmptyTitle(){
        $(productEmptyTitle()).isDisplayed();
    }

    @Step
    public void clickBayarButton(){
        $(bayarButton()).click();
    }
}
