package HomePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerttt {

    /*
    * 1. User Launch Browser - Chromebrowser
    * 2. User Open Url - https://opensource-demo.orangehrmlive.com/
    * 3. User Provide username - Admin
    * 4. User Provide password - admin123
    * 5. User Click on login button
    * 6. User Verify the title of dashboard page. Exp title: Orange HRM
    * 7. User Close Browser
    * */


    public static void main(String[] args) throws InterruptedException {



        //1. User Launch Browser - Chromebrowser
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //2. User Open Url - https://opensource-demo.orangehrmlive.com/
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
        Alert alertwindow = driver.switchTo().alert();
        System.out.println(alertwindow.getText());
        alertwindow.accept();
        Thread.sleep(3000);
        alertwindow.sendKeys("Welcome");
        Thread.sleep(3000);

        //driver.quit();

    }
}
