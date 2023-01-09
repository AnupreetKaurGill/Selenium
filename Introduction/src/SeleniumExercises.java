import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExercises {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		//Count of the Link in the Entire Page
		
		System.out.println("Links in the Page");
		System.out.println(driver.findElements(By.tagName("a")).size());
	
		//Count of links in the footer section of the page
	
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
		System.out.println("Links in the footer section");
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//Count of links in the first column of footer section of the page
		
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		
		//4- click on each link in the coloumn and check if the pages are opening-
		//4- click on each link in the coloumn and check if the pages are opening-
				for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
				{
					
					String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);  //press control to open each link on each tab
					
					coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
					Thread.sleep(5000L);
					
				}
				
				Set<String> abc=driver.getWindowHandles();//4
				Iterator<String> it=abc.iterator();
				
				while(it.hasNext())
				{
					
				   driver.switchTo().window(it.next());
				   System.out.println(driver.getTitle());
				
				}
				
				
		
	}

}
