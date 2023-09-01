package Core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Createcategory {
	WebDriver driver;

	public Createcategory(WebDriver driver) {
		this.driver = driver;
	}

	By bydropdown = By.xpath("//*[text()='Menu Management']");
	By byoption = By.xpath("//*[text()='Category']");
	By byADDNEW = By.xpath("//*[@href='Create']");
	By byTitle = By.id("txtTitle");
	By byDescription = By.xpath("//input[@id='txtDescription']");
	By byChoosefile = By.id("imgFile");
	By byCreate = By.xpath("//input[@type='submit']");

	public void CreateNewCategory() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		WebElement MManagement = driver.findElement(bydropdown);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red');", MManagement);
		Thread.sleep(2000);
		driver.findElement(bydropdown).click();
		Thread.sleep(2000);
		WebElement category = driver.findElement(byoption);
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		jsc.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				category);
		driver.findElement(byoption).click();
		Thread.sleep(1000);
		System.out.println("Home , Menu Management / Category , ADD NEW ");
		WebElement addnew = driver.findElement(byADDNEW);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red');", addnew);
		driver.findElement(byADDNEW).click();
		Thread.sleep(1000);
		driver.findElement(byTitle).sendKeys("jsyfjef");
		Thread.sleep(1000);
		driver.findElement(byDescription).sendKeys("rh4ncnmg");
		Thread.sleep(1000);
		driver.findElement(byCreate).click();
		/*
		 * Robot robot = new Robot(); JavascriptExecutor j = (JavascriptExecutor)
		 * driver; j.executeScript("arguments[0].click();",
		 * driver.findElement(byChoosefile)); StringSelection ss = new
		 * StringSelection("C:\\Users\\CA005\\Pictures\\Camera Roll");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
		 * 
		 */
	}

}
