package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public WebDriver driver;

	public void setup() {
		String AppURL = ("http://digiorder-enterprise-dev.serinsol.com/");
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\CA005\\eclipse-workspace\\DIGIORDER\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(AppURL);
	}

}
