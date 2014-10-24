package home4;

import common.CommonDriver;
import org.testng.annotations.Test;


/**
* Created by israt on 8/31/2014.
*/
public class SearchYahoo  extends CommonDriver {
    @Test

    public void testYahoo() throws InterruptedException
    {
        typeByXpath("//*[@id='p_13838465-p']", "Bangladesh");
        clickByXpath("//*[@id='search-submit']");
        sleep(3);
    }
}
