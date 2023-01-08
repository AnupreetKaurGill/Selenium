import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		// To get the IDs of multiple windows opened
		Set<String> windows = driver.getWindowHandles();      ////[parentid,childid,subchildId]
		Iterator<String>it = windows.iterator();
		
		String parentId = it.next();

		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String text = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailID= text.split("@")[1].split(" ")[0];
		//System.out.println(emailID);
		
		driver.switchTo().window(parentId);

		driver.findElement(By.id("username")).sendKeys(emailID);
		driver.close();
		
		

	}

}
