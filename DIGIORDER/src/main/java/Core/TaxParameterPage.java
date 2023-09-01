package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaxParameterPage {
	WebDriver driver;

	public TaxParameterPage(WebDriver driver) {
		this.driver = driver;
	}

	By PInfo = By.xpath("//a[text()='Payments Info']");
	By taxpmeter = By.xpath("//a[text()='Tax Parameter']");
	By ADDNEW = By.xpath("//a[text()='ADD NEW']");
	By title = By.id("txtTitle");
	By Discrip = By.id("txtDescription");
	By value = By.id("txtValue");
	By dropdown = By.id("txtType");
	By dvalue = By.xpath("//option[@value='Percentage']");
	By create = By.xpath("//input[@type='submit']");

	public void ValidateUserIsAbleToNavigateTaxParameter() throws InterruptedException {
		Thread.sleep(2000);
		WebElement pinfo = driver.findElement(PInfo);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red');", pinfo);
		driver.findElement(PInfo).click();
		Thread.sleep(2000);
		WebElement taxpm = driver.findElement(taxpmeter);
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		jsc.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				taxpm);
		driver.findElement(taxpmeter).click();
		Thread.sleep(2000);
		WebElement addnew = driver.findElement(ADDNEW);
		JavascriptExecutor jsE = (JavascriptExecutor) driver;
		jsE.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red');", addnew);
		driver.findElement(ADDNEW).click();
		Thread.sleep(2000);
		driver.findElement(title).sendKeys("twifrng");
		Thread.sleep(2000);
		driver.findElement(Discrip).sendKeys("errigigth");
		Thread.sleep(2000);
		driver.findElement(value).sendKeys("dkgog");
		Thread.sleep(2000);
		driver.findElement(dropdown).click(); 
		Thread.sleep(1000);
		driver.findElement(dvalue).click();
		Thread.sleep(2000);
		driver.findElement(create).click();
	}

}
