package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

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

//        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();

        //1. User Launch Browser - Chromebrowser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //2. User Open Url - https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String Titlee=driver.getTitle();
        System.out.println("This title is captured before login from the dashboard page: " +Titlee);
        Thread.sleep(3000);

        //3. User Provide username - Admin
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");

        //4. User Provide password - admin123
        driver.findElement(By.name("password")).sendKeys("admin123");

        //5. User Click on login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        //6. User Verify the title of dashboard page. Exp title: Orange HRM
        String Title=driver.getTitle();
        System.out.println("This title is captured after login from the dashboard page: " +Title);

        // 7. User Close Browser
        driver.quit();

    }
}
