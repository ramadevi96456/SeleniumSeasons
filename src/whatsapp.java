import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class whatsapp {

	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
    driver.get("https;//www.whatsapp.com");
    Thread.sleep(3000);
   driver.findElement(By.xpath("//a[@data-testid=open-registration-form-button]")).click();
   Thread.sleep(3000);
   driver.findElement(By.name("birthday-day")).sendKeys("20");
   driver.findElement(By.name("birthday-month")).sendKeys("oct");
    driver.findElement(By.name("birthday-year")).sendKeys("2023");
   Thread.sleep(3000);
    driver.quit();
         
	}
}
    


