package home3;

import common.CommonDriver;
import org.testng.annotations.Test;

/**
 * Created by israt on 8/23/2014.
 */
public class SearchFacebook extends CommonDriver {
    @Test
    public void signIn()throws InterruptedException{
        typeByCss("#email", "novemberrain2424@gmail.com");
        typeByCss("#pass", "pocha24");
        enterKeys("#pass");
        sleep(3);
    }


}
