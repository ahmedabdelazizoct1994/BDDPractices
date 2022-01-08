package bdd.cucumber;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {


    public static WebDriver driver;

    public static Properties prop= new Properties();

    public  Base()  {

        PageFactory.initElements(driver, this);

try{
        File file= new File("src/main/java/properties/Config.properties");
        FileInputStream fis= new FileInputStream(file);
        prop.load(fis);

    } catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}


    }


    public static void  launchBrowser(){

         if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();}
         else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
           WebDriverManager.edgedriver().setup();
           driver=new EdgeDriver();}
         else
         {
             throw new Error("browser not supported");
         }

        driver.navigate().to(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

}
