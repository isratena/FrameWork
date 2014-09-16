package home1;

import common.CommonDriver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
* Created by israt on 8/22/2014.
*/

public class SearchCnn extends CommonDriver {
    @Test
    public void searchBox()throws InterruptedException{
        typeByCss("#hdr-search-box", "politics");
        clickByXpath(".//*[@id='hdr-search']/form/div/div[2]/input");
        sleep(3);
    }

}
