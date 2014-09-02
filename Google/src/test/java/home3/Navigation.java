package home3;

import common.CommonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by israt on 8/29/2014.
 */
public class Navigation extends CommonDriver {

    @Test

    public void test1() throws InterruptedException {
        List<WebElement> tab = getWebElements("#default-p_30345789 li");
        for (int i = 2; i < tab.size(); i++) {
//           if (i == 2 || i == 8 || i == 9) {
           if (i<=16){

                tab.get(i).findElement(By.tagName("a")).click();
                navigateBack();
                sleep(2);
            } else {
                tab.get(i).findElement(By.tagName("a")).click();
               navigateBack();
                sleep(2);
            }

            tab = getWebElements("#default-p_30345789 li");
        }

    }
}
