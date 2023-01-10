import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExerciseSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(option);

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select selectOption = new Select(dropdown);
		selectOption.selectByVisibleText(option);
		driver.findElement(By.name("enter-name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();
		if (text.contains(option))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");

	}
}
