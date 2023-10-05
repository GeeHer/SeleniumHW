package Homework;
/*HW2:
goto gmail.com
click on help
click on privacy
click on terms
switch the focus on terms page and get the title and print on screen
then switch the focus back to the gmail page
and print the title of the main page on screen*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=AYZoVhd0Gao0nqqTQ_KUXINYg1jlN278-9P4iUoZJr-T3oo5iC4G1rjvJytN5-Dq0Qn6lDXO0Z2H&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1711289459%3A1696468154007587&theme=glif");
        driver.manage().window().maximize();

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        WebElement termBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
        termBtn.click();

        String gmailHandle = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles){

            driver.switchTo().window(handle);

            String title = driver.getTitle();

            if(title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getTitle());
        System.out.println(gmailHandle);



    }
}
