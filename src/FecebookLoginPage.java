import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FecebookLoginPage {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Launch Facebook page
		driver.get("https://www.facebook.com/");

		// Maximize Screen
		driver.manage().window().maximize();

		// delete all cookies
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abc@gamil.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yhgvdj");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	

	}

}
