import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class herokupp {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Setup chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        // Maximise Browser
        driver.manage().window().maximize();
        //We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the page title
        String title = driver.getTitle();
        System.out.println("This is the page title: " + title);

        //Print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current url: " + url);

        //Print the page source
        System.out.println("Page source" + driver.getPageSource());

        //
        driver.findElement(By.id("username")).sendKeys("chintaaan@yahoo.com");

        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("Chintz2023");

        //Close the browser
        driver.close();
    }
    }
