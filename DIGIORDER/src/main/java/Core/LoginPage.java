package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By byUserID = By.id("txtUserID");
	By byPassword = By.id("txtPassword");
	By bySubmit = By.xpath("//input[@type='submit']");

	public void launchapplication() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(byUserID).sendKeys("SADMIN");
		Thread.sleep(1000);
		driver.findElement(byPassword).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(bySubmit).click();
	}
}
