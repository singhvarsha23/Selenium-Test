import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SampleJava {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//Gecko driver is for firefox. Drivers can be downloaded from seleniumhq.org
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\VARSHA SINGH\\workspace-luna\\Driver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		fd.get("http://www.gmail.com");
		
		//Will always wait for 5 seconds whenever findelemnt is used
				
		WebElement username = fd.findElement(By.id("Email"));
		username.sendKeys("singhvarsha23@gmail.com");
		fd.findElement(By.id("next")).click();
		Thread.sleep(3000);
		WebElement pwd = fd.findElement(By.id("Passwd"));
		pwd.sendKeys("test");
		fd.findElement(By.id("signIn")).click();
		//fd.quit();
	}

}
