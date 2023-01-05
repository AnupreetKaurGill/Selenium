import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
  driver.close();
	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
	
	int j=0;
	
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0;i<products.size();i++)

	{
		//Brocolli - 1 Kg:  actual Text retrieved

		//Brocolli,    1 kg  : split based on -

		String[] name=products.get(i).getText().split("-");
		
		//format it to get actual vegetable name

		String formattedName=name[0].trim();   //remove spaces after name
		
		//convert array into array list for easy search

	List itemsNeededList = Arrays.asList(itemsNeeded);
	
//  check whether name you extracted is present in arrayList or not-

	if(itemsNeededList.contains(formattedName)) {
		
		j++;

		//click on Add to cart

		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
		if(j==itemsNeeded.length)

		{

		break;

		}
	}


	}
}
	
	

}
