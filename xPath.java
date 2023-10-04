package Homework;
/*goto https://demoqa.com/text-box
and use xpath to fill the form and submit it*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys(" Memo Herrera");

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("gee92@gmail.com");

        WebElement address= driver.findElement(By.xpath("//textarea[starts-with(@id,'currentAddress')]"));
        address.sendKeys("Hyattsville, Maryland, USA");

        WebElement permAddress= driver.findElement(By.xpath("//textarea[starts-with(@id,'permanentAddress')]"));
        permAddress.sendKeys("College Park,Maryland,USA");

        WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
    }
}
