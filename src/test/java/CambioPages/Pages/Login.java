package CambioPages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ConfigTest;
import utility.connector;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Login {

       connector conn = new connector();
       WebDriver driver;
       String url;

    ConfigTest conf = new ConfigTest("config");

    {

   driver = conn.openBrowser("chrome");



    }

    public Login() throws IOException {
        url = conf.getProperty("url");

    }
    public void accessPage(WebDriver driver) throws IOException, InterruptedException {


        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);


        driver.get(this.url);

        driver.findElement(By.id("username")).sendKeys(conf.getProperty("username"));

        driver.findElement(By.id("password")).sendKeys(conf.getProperty("password"));

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[3]/button")).click();

//        WebDriverWait wait = new WebDriverWait(driver,10);
//        WebElement explicit = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("//*[@id=\"root\"]/div/form/div[3]/button"))));
//        explicit.click();


        Thread.sleep(Long.parseLong(conf.getProperty("timer")));

        //System.out.println("Successful");

        //   return driver.getCurrentUrl();

    }

    public String getURL(WebDriver driver) throws IOException, InterruptedException {
        System.out.println( driver.getCurrentUrl());
        return driver.getCurrentUrl();
   }

  //  public String getURL(String s) {
    //    return s  ;
    // }
}