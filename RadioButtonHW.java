package Homework;
/*Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
Check if the "Female" radio button is displayed.
Click on the "Show Button".
Check again if the "Female" radio button is displayed or not.
Print the results of the checks to the console.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonHW { public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("http://35.175.58.98/basic-checkbox-demo.php");
    driver.manage().window().maximize();

    List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

    for(WebElement checkBox:checkBoxes){
        String option = checkBox.getAttribute("value");
        if(option.equals("Checkbox-1"));
        boolean state = checkBox.isEnabled();
        System.out.println(state);
        if(!state){
            WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            enableBtn.click();

            boolean status2 = checkBox.isEnabled();
            if(status2){
                checkBox.click();
                boolean isSelectedStatus = checkBox.isSelected();
                System.out.println(isSelectedStatus);
            }
        }
    }

}
}
