package PageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.List;

/**
 * Created by Christian Gibbs on 9/27/2016.
 */
public class SkiUtahPage {


    @FindAll(
            @FindBy(how = How.TAG_NAME, using = "a")
    )
    List<WebElement> pageLinks;

    public WebDriver driver;

    public SkiUtahPage(WebDriver driverIn) {
        driver = driverIn;
        PageFactory.initElements(driver, this);
    }

    public void Crawl(){
        for (WebElement link:pageLinks
             ) {
            //TODO start crawl method here
System.out.println(link.getAttribute("href"));
        }//end foreach
    }//end method


    public boolean GoToPage(String url, String verificationString)
    {
        url = url.toLowerCase();
        String title = verificationString.toLowerCase();
        if(driver.getCurrentUrl().toLowerCase()!= url)
        {
            driver.get(url);
        } //Endif
        return driver.getTitle().toLowerCase().contains(title);
    }
}
