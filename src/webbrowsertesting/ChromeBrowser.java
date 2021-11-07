package webbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.wcht.org.uk/";
        System.setProperty("webdriver.chrome.driver","https://www.wcht.org.uk/");
        WebDriver driver=new EdgeDriver();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        driver.close();

    }


}
