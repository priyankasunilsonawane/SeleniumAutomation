import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//Launch browser
		driver.get("https://www.google.com");
		
		//Maximize Screen
		driver.manage().window().maximize();
		
		//delete all cookies
		driver.manage().deleteAllCookies();

	}

}
