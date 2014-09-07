package home1;

import common.CommonDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by israt on 8/23/2014.
 */
public class TvPrograms extends CommonDriver {
   // @Test
    public void dropDownMenuTvProgram(){
        // List<WebElement> list = getWebElements(".tvPrograms select option");
        // WebElement element = getWebElement(".tvPrograms>select");
        WebElement element = getWebElement(".cnn_tsbnav.cnn_pmtvmodddown select");
        List<String> listOfMenuText = getTextList(".cnn_tsbnav.cnn_pmtvmodddown select option");
        for(int i=0; i<listOfMenuText.size(); i++){
            if(i==1||i==3){
                continue;
                //  if(element.isEnabled()) {
            }else{
                selectElementByOption(element,listOfMenuText.get(i));
            }
            navigateBack();
            element = getWebElement(".cnn_tsbnav.cnn_pmtvmodddown select");
        }
    }
}
