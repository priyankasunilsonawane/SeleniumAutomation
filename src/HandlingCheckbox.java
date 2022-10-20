import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	driver.manage().window().maximize();
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	
	
}
}
