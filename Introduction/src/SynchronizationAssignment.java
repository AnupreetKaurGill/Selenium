import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		
		//Thread.sleep(3000);
		
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement dropdownoption = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select (dropdownoption);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> addButtons = driver.findElements(By.cssSelector(".btn-info"));
		
		for(int i =0; i<addButtons.size(); i++) {
			addButtons.get(i).click();
		
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.close();
	}

}
