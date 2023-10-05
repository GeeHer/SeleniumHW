package Homework;
/*HW1:
goto  http://35.175.58.98/handle-iframe.php
click the checkbox
then select the  babyCat
then enter topic name
all of this must be done in the same order*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickCheckBox { public static void main(String[] args) {
    // Make the instance
    WebDriver driver = new ChromeDriver();
    driver.get("http://35.175.58.98/handle-iframe.php");
    driver.manage().window().maximize();

    WebElement frameX = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
    driver.switchTo().frame(frameX);

    WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
    Select sel = new Select(animals);
    sel.selectByVisibleText("Baby Cat");

    driver.switchTo().defaultContent();

    driver.switchTo().frame(0);
    driver.switchTo().frame("checkboxIframe");
    WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
    checkBox.click();

    driver.switchTo().defaultContent();
    driver.switchTo().frame(0);
    WebElement topic= driver.findElement(By.xpath("//input[@name='Topic']"));
    topic.sendKeys("iFrame");

}
}
