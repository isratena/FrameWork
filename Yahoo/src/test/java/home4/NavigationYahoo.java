package home4;

import common.CommonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by israt on 8/31/2014.
 */
public class NavigationYahoo  extends CommonDriver {

    @Test

    public void test1() throws InterruptedException {
        List<WebElement> tab = getWebElements(".navlist li");
        System.out.println(tab.size());
        for (int i = 2; i < tab.size(); i++) {

            tab.get(i).click();
            driver.navigate().back();
            sleep(3);
            tab = getWebElements(".navlist li");
        }


    }

}

