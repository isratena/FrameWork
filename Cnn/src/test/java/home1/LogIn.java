package home1;

import common.CommonDriver;
import org.junit.Test;
import org.openqa.selenium .By;

/**
 * Created by israt on 9/7/2014.
 */
public class LogIn extends CommonDriver {
   // @Test
    public void LoggingCnn()throws InterruptedException{
           // driver.findElement(By.xpath("//*[@id='hdr-auth']/ul/li[2]/a")).click();
            driver.findElement(By.xpath("//*[@id='hdr-auth']/ul/li[2]/a")).click();
            driver.findElement(By.xpath("//*[@id='cnnConnectFormLogin']/div[1]/div/a")).click();
            typeByXpath("//*[@id='cnnOverlayEmail1l']", "isratena@yahoo.com");
            typeByXpath("//*[@id='cnnOverlayPwd']", "123");
            enterKeys("#pass");
            sleep(3);

}}
