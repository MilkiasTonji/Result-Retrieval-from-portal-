package FacebookDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacabookRegistration {
    WebDriver driver = new ChromeDriver();

    public void getNews(){
        driver.get("http://www.bbc.com");
        driver.manage().window().maximize();


    }

}
