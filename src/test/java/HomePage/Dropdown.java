package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

//        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");----Select Tag
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Using Select Tag
//       WebElement itemsForDropdown = driver.findElement(By.xpath(" //select[@id='first']"));
//        Select select = new Select(itemsForDropdown);
//        Thread.sleep(2000);
////        select.selectByVisibleText("Google");
//        select.selectByValue("Yahoo");
    driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

     List <WebElement> dropdownele=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));

//        System.out.println("The total number of dropdown items: "+ dropdownele.size());
//
//        for(int i=0; i<dropdownele.size(); i ++){
//
//            String listOfItems= dropdownele.get(i).getText();
//            System.out.println(listOfItems);
//        }


        for(int i=0;i<dropdownele.size(); i++ ){

            if(dropdownele.get(i).getText().equals("Java")){

                dropdownele.get(i).click();
            }

        }




        driver.quit();
    }

}
