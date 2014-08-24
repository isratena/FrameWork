package home3;

import common.CommonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by israt on 8/23/2014.
 */
public class SearchGoogle extends CommonDriver {
    @Test

    public void testGoogle() throws InterruptedException
    {
        typeByCss("#searchText", "Bangladesh");
        clickByXpath("//*[@id='searchSubmit']");
        sleep(3);
}
}