import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;

public class Collector {

	// Create a new instance of the Chrome driver
	public static WebDriver driver = new ChromeDriver();
	
	@SuppressWarnings("null")
	public static void main(String[] args) {

		// visit hup.hu
		// driver.get("https://hup.hu/");
		driver.navigate().to("https://hup.hu/");
		//	waitForPageLoaded();
		
		//	// Find the first 10 topic and save elements
		//	WebElement[] forums = null;				
		//	for (int i = 1; i <= 10; i++) {
		//		forums[i]= driver.findElement(By.xpath("//*[@id=\"block-block-16\"]/div/table/tbody/tr[" + i + "]/td[2]/a"));
		//	}
		
		// Click on the 10 topic one by one
		//WebElement[] users = null;
		//for (int i = 1; i <= 10; i++) {
		//forums[i].click();
		//waitForPageLoaded();
		
		// Find the first 10 users (or less if there are less than 10 comment in that topic)
		
		
		//int j=1;
		//int k=0;
		//do {
		//	users[i]= driver.findElement(By.xpath("//*[@id='comments']/div[" + j + "] and @class=’comment’]/div[1]"));
		//	if (users[i].getSize()!=null) {
		//		k++;
		//		}
		//	}
		//while	(k==10 || time???);
		//};
		//}
		// Close the browser
		driver.quit();
	}

	public static void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}
}
