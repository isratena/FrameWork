package home3;

import common.CommonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.sql.Driver;
import java.util.List;

/**
 * Created by israt on 8/23/2014.
 */
public class SearchFacebook extends CommonDriver {
    @Test
    public void signIn()throws InterruptedException {
        typeByCss("#email", "novemberrain2424@gmail.com");
        typeByCss("#pass", "hereugo");
        enterKeys("#pass");
        sleep(3);
    }}
//        clickByXpath("//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]");
//    clickByXpath("//*[@id='u_jsonp_6_3']/a[4]");
//    // List<WebElement> friends = driver.findElements(By.xpath("//div['@class=fsl fwb fcb']/a"));
//    //List<WebElement> tab = getWebElements("#cnn_hdr-nav li")
//    // System.out.println("Tatal friends-->" + friends.size());
//    // WebElement lastFriend = friends.get(friends.size() - 1);
////        Action act = new Action(Driver);
////        act.moveToElement(lastFriend).build().perform();
////    }
//    sleep(5);
//
//}
//}
