package Test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotDemo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\naveen\\Desktop\\msedgedriver.exe");  
	    WebDriver driver=new EdgeDriver();  
	      
	// Launch website  
	    driver.navigate().to("https://www.google.com/"); 
	    driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("Discovery",Keys.ENTER); 
	    File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   
	    FileUtils.copyFile(f, new File("D:\\Naveen\\Java Projects\\Selenium\\disco.png"));
	    System.out.println("Screenshot Captured");
	}
}
