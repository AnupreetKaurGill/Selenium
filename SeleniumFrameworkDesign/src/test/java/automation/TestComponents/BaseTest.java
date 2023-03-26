package automation.TestComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	public void initializeDriver() throws IOException 

	{
		// properties class

				 Properties prop = new Properties();
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
						+ "//src//main//java//automation//resources//GlobalData.properties");
				prop.load(fis);
		
				//String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");
				String browserName =prop.getProperty("browser");
				
				if (browserName.contains("chrome")) {
					//ChromeOptions options = new ChromeOptions();
					WebDriverManager.chromedriver().setup();
					
//					if(browserName.contains("headless")){
//					options.addArguments("headless");
//					}	
					
					driver = new ChromeDriver();
					//driver.manage().window().setSize(new Dimension(1440,900));//full screen

				} else if (browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver",
							"/Users/anu//documents//geckodriver");
					driver = new FirefoxDriver();
					// Firefox
					
				} else if (browserName.equalsIgnoreCase("edge")) {
					// Edge
					System.setProperty("webdriver.edge.driver", "edge.exe");
					driver = new EdgeDriver();
				}

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
		
	}

}
