package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By Logout = By.xpath("//a[text()=' Logout ']");

	public void ValidateUserIsAbleToLogout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(Logout).click();
		driver.close();
		driver.quit();
	}

}
