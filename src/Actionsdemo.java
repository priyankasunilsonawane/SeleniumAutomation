import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://www.amazon.in/s?k=oriflame+exfoliating+shower+gel&crid=2PLN7AYMNLHHJ&sprefix=oriflame+exfoliating+shower+gel%2Caps%2C340&ref=nb_sb_noss");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	//Move to specific element
	act.moveToElement(ele).build().perform();
	
	//Capital
	act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Mobile").build().perform();
	
	//right click
	act.moveToElement(ele).contextClick().build().perform();
}
}
