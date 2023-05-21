package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class Checkbox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        selecting single checkbox
//        driver.findElement(By.xpath("//input[@id='monday']")).click();
//        driver.findElement(By.xpath("//input[@id='tuesday']")).click();
//        driver.findElement(By.xpath("//input[@id='wednesday']")).click();
//        driver.findElement(By.xpath("//input[@id='thursday']")).click();
//        driver.findElement(By.xpath("//input[@id='friday']")).click();
//        driver.findElement(By.xpath("//input[@id='saturday']")).click();
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();


        List<WebElement> allCheckBoxItems=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println("Total number of days are: "+ allCheckBoxItems.size());

        //Select all the checboxes
//        for(int i=0; i<allCheckBoxItems.size(); i++){
//
//            allCheckBoxItems.get(i).click();
//
//        }

//        for(WebElement checkbox:allCheckBoxItems){
//
//            checkbox.click();
//        }
        for(int i=4; i<allCheckBoxItems.size();i++){

            allCheckBoxItems.get(i).click();
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
