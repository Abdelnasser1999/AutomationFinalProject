package DiscoverFlow;

import ConfigData.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DiscoverFlowPOM {
    public static WebElement getCloseAdButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"cpwm-additionaldisclaimer3\"]/button"));
    }

    public static WebElement getFurnitureElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[1]"));
    }

    public static WebElement getCategoryPageHeader(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-body-container\"]/main/div[3]/div/div[1]/div[2]/div[2]/h1"));
    }

    public static WebElement getOutdoorElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[2]"));
    }

    public static WebElement getRugsElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[3]"));
    }
    public static WebElement getDecorAndPillowsElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[4]"));
    }

    public static WebElement getLightingElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[5]"));
    }

    public static WebElement getWallDecorAndMirrorsElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[6]"));
    }

    public static WebElement getKitchenElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[7]"));
    }

    public static WebElement getDiningElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[8]"));
    }

    public static WebElement getFoodAndDrinkElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[9]"));
    }

    public static WebElement getGiftsElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[10]"));
    }

    public static WebElement getHolidaysElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[11]"));
    }

    public static WebElement getSaleElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[12]"));
    }
    public static WebElement getSalePageHeader(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-body-container\"]/main/div[3]/div/div/div/div[3]/h1"));
    }

    public static WebElement getInspirationElement(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"ml-navbar-collapse\"]/div/div/ul/li[13]"));
    }

    public static WebElement getInspirationPageHeader(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"cpwm_single_fillslot_gateway-1\"]/div/div[1]/div/h1"));
    }



}
