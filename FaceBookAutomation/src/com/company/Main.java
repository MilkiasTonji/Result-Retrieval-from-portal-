package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://portal.aait.edu.et/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("ATR/8137/08");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("MILKIAStonji@result");
        driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div[2]/form[1]/div[4]/div[1]/button[1]")).submit(); //submitting the data


        driver.navigate().to("http://portal.aait.edu.et/Grade/GradeReport");
        driver.navigate().forward();

        WebElement webElement = driver.findElement(By.className("text-left"));
        System.out.println("The data: " + webElement.getText());

        WebElement sementer = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(2) > td"));
        System.out.println(sementer.getText());

        WebElement course1 = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(2)"));
        System.out.print(course1.getText());
        System.out.print("              ");
        WebElement course1Result = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(6)"));
        System.out.println(course1Result.getText());

System.out.println("---------------------------------------------------------------------");

        WebElement course2 = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(4) > td:nth-of-type(2)"));
        System.out.print(course2.getText());
        System.out.print("              ");
        WebElement course2Result = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(4) > td:nth-of-type(6)"));
        System.out.println(course2Result.getText());

        System.out.println("---------------------------------------------------------------------");


        WebElement course3 = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(5) > td:nth-of-type(2)"));
        System.out.print(course3.getText());
        System.out.print("              ");
        WebElement course3Result = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(5) > td:nth-of-type(6)"));
        System.out.println(course3Result.getText());

        System.out.println("---------------------------------------------------------------------");



        WebElement course4 = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(6) > td:nth-of-type(2)"));
        System.out.print(course4.getText());
        System.out.print("              ");
        WebElement course4Result = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(6) > td:nth-of-type(6)"));
        System.out.println(course4Result.getText());

        System.out.println("---------------------------------------------------------------------");


        WebElement course5 = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(7) > td:nth-of-type(2)"));
        System.out.print(course5.getText());
        System.out.print("              ");
        WebElement course5Result = driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(7) > td:nth-of-type(6)"));
        System.out.println(course5Result.getText());

        System.out.println("---------------------------------------------------------------------");



        for (int i =0; i <1; i++){
            for (int j=0; j<1; j++){
                WebElement data = driver.findElement(By.tagName("table"));
                System.out.println(data.getText());
            }
        }


////        driver.findElement(By.xpath("//*[@id=\"m2\"]/a[1]")).submit();//this is for grade report link
//
//        //we need to instantaite another class for dropdowns
//
////        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"m2\"]/a[1]")));//getting the dropdown
////        select.selectByIndex(0);
////        select.selectByVisibleText("Grade Report");//I can use this because this is teh visible text
//
//        Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"navBarCol\"]")));
//        List<WebElement> list = select1.getOptions();
//        for (WebElement webElement: list){
//            System.out.println("NavBar: " + webElement.getText());
//        }






    }
}
