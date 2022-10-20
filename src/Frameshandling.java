import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frameshandling {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement ele1=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement ele2=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act=new Actions(driver);
	
	act.dragAndDrop(ele1, ele2).build().perform();
	
}
}
