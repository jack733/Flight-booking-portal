package pageObjects;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PageObjects_methods {

    public static WebDriver driver;
    static String Source= "New Delhi";
    static String destination = "Hyderabad";;
    
    
 // Browser Properties
  
    public static void StartBrowserProprties() {
    	System.setProperty("webdriver.gecko.driver","C:\\Xiaomi\\geckodriver-v0.27.0-win64/geckodriver.exe");
    	driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.ixigo.com/flights");    
    	}
    
 //Search Flight
 
    static void parameterValues(String Source, String destination ) {
    }
    
public static void search() throws InterruptedException {
    	
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

parameterValues(Source, destination);
driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[6]/div/div/div[1]/div/div[1]/input")).sendKeys(Source);
driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[6]/div/div/div[1]/div/div[1]/input")).sendKeys(destination); 

Thread.sleep(5000);

driver.findElement(By.xpath("//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']")).sendKeys("Hyderabad");
Thread.sleep(5000);

driver.findElement(By.xpath("//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']")).sendKeys(Keys.ENTER); 
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("//div[1]//table[1]//tbody[1]//tr[5]//td[3]//div[1]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
    }

// Fares
 public static void sortthefares() throws InterruptedException {
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

driver.findElement(By.xpath("//div[contains(@class,'c-dropdown srt-dd-cntr')]//div[contains(@class,'')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(" //li[contains(@class,'dropdown-list-item')]//span[contains(text(),'CHEAPEST')]")).click();
    }
 
 // Book flight

public static void Bookflight() throws InterruptedException {
Thread.sleep(5000);
driver.findElement(By.xpath("//div[3]//div[1]//div[3]//div[1]//div[2]//button[1]//div[1]")).click();

}

public static void fares() throws InterruptedException {
Thread.sleep(5000);

List<WebElement> prices=driver.findElements(By.xpath("//div[@class='page-content u-layout-2-col']//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//span[2]"));

int size=prices.size();
System.out.print(size);

String price1=prices.get(0).getText();
System.out.println(price1);

String price2=prices.get(1).getText();
System.out.println(price2);

}

// Quit Driver
    public static void Quit(){
    	driver.quit();  
    }

    
}
