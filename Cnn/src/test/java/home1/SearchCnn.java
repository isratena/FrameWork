package home1;

import common.CommonDriver;
import org.junit.Test;
import org.openqa.selenium.By;

/**
* Created by israt on 8/22/2014.
*/

public class SearchCnn extends CommonDriver {

        @Test
        public void searchBox()throws InterruptedException{
//            driver.findElement(By.xpath("//*[@id='hdr-auth']/ul/li[2]/a")).click();
//            driver.findElement(By.xpath("//*[@id='hdr-auth']/ul/li[2]/a")).click();
//            driver.findElement(By.xpath("//*[@id='cnnConnectFormLogin']/div[1]/div/a")).click();
//            typeByXpath("//*[@id='cnnOverlayEmail1l']", "isratena@yahoo.com");
//            typeByXpath("//*[@id='cnnOverlayPwd']", "pocha123");
//            enterKeys("#pass");
//            sleep(3);

            typeByCss("#hdr-search-box", "politics");
            clickByXpath(".//*[@id='hdr-search']/form/div/div[2]/input");
            sleep(3);
        }
}


