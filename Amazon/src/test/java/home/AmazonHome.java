package home;
import common.CommonDriver;
import org.testng.annotations.Test;

//
///**
// * Created by israt on 8/22/2014.
// */
//public class AmazonHome {
//}
public class AmazonHome extends CommonDriver {

    @Test
    public void searchBox() throws InterruptedException {
        typeByXpath("//*[@id='twotabsearchtextbox']", "iphone");
        clickByCss(".nav-submit-input");
        sleep(3);
    }
}