import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionDropDown {
public static void main(String[] args) throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	driver.manage().window().maximize();
	driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	Thread.sleep(3000);
	List<WebElement> list=driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
	for (WebElement option : list) {
		if(option.getText().equalsIgnoreCase("India")){
			option.click();
		}
		else {
			System.out.println("Incorrct option");
		}
		
	}
}
}
