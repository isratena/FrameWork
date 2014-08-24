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
        typeByCss("#twotabsearchtextbox", "iphone");
        clickByXpath("//*[@id='nav-searchbar']/div[1]/input");
        sleep(3);
    }
}