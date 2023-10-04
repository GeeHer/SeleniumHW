package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*http://35.175.58.98/no-select-tag-dropdown-demo.php
Select your dream destination from this calendar*/
public class DreamVacationDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
        dropDown.click();

        WebElement destination = driver.findElement(By.xpath("//a[contains(text(),'Greece')]"));
        destination.click();

        Thread.sleep(2000);
        driver.quit();



    }
}
