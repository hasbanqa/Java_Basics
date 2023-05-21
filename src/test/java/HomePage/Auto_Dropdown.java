package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Auto_Dropdown {

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
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //2. User Open Url - https://opensource-demo.orangehrmlive.com/
        driver.get("https://google.com/");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        Thread.sleep(3000);
        List<WebElement> listofitems=driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
        System.out.println("Total number of items: "+ listofitems.size());

        for (int i=0; i<listofitems.size(); i++){

            String items=listofitems.get(i).getText();
            System.out.println(items);

            if(items.equals("selenium foods")){

                listofitems.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
