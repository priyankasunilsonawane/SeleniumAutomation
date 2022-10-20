import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	driver.manage().window().maximize();
	driver.findElement(By.id("name")).sendKeys("Manu");
	driver.findElement(By.id("alertbtn")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
}
}
