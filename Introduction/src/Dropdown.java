import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// dropdown with Select tag - static      (selecting currency)
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select(staticDropdown);

		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		

		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Dropdown without select tag   (selecting passengers)
		
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());     

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();    //click on adults

		}

		driver.findElement(By.id("btnclosepaxoption")).click();   // click on done

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Dynamic dropdown
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();     //From 
		Thread.sleep(2000);
		
		// destination location   
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();   //with indexes
		
		//parent-child relationships
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//current date calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		driver.close();

	}

}
