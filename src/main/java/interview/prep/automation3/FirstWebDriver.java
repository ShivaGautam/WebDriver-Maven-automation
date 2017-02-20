package interview.prep.automation3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstWebDriver {

	@Test
	public void homePage() {

		System.setProperty("webdriver.chrome.driver",
				"//Users//rgauta01//Documents//shiva_study//workspace//corejava//WebDriver-Practice//resources//chromedriver");

		WebDriver driver = new ChromeDriver(); // WebDriver is interface and
												// ChromeDriver is an
												// implementation class
		// Open the browser with the given URL
		driver.get("https://www.walmart.com/");
		System.out.println("Home Result page : " + driver.getTitle());
		// find the element

		// By by =By.id("global-search-input");

		// driver.findElement(by);

		// OR
		WebElement element = driver.findElement(By.id("global-search-input")); // It
																				// identify
																				// the
																				// element
																				// and
																				// return
																				// the
																				// WebElement
		// perform action

		element.sendKeys("Laptop");

		// assert for the result
		element = driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn"));
		element.click();
		System.out.println("Search Result page : " + driver.getTitle());
		driver.close();
	}

}
