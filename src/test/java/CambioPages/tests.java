package CambioPages;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import CambioPages.Pages.Login;
import utility.ConfigTest;
import org.openqa.selenium.WebDriver;
import utility.connector;

import java.io.IOException;


public class tests {

    ConfigTest conf;
    connector conn = new connector();
    WebDriver driver;
    Login lt = new Login();
     String url = null;


    public tests() throws  InterruptedException,IOException {

        conf = new ConfigTest("config");
        driver  =  conn.openBrowser(conf.getProperty("browser"));


  }






    @Test (priority = 1)
    public void ValidPassword() throws InterruptedException, IOException {
       // System.out.println("Hello123");
        //login lt = new login();
//        lt.accessPage(driver);
//        System.out.println(driver);
//       url = driver.getCurrentUrl();
//       System.out.println(url);
//       String s = url;
//       Assert.assertEquals(url,s);
//       wait(500);
        lt.accessPage(driver);


    }

    @Test (priority = 2)
    public void Dashboard() throws InterruptedException, IOException{
        String s = driver.getCurrentUrl();
        System.out.println(s);
    }

   @AfterTest
   public void tearDown(){

       url = driver.getCurrentUrl();
        System.out.println(url);
   driver.quit();
   }



}