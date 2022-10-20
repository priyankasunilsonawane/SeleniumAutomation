import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkIn_newTab {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		WebElement footerLinks=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerLinks.findElements(By.tagName("a")).size());
		
		WebElement column=footerLinks.findElement(By.xpath("//table[@class='gf-t']//tbody//tr//td[1]//ul"));
		System.err.println(column.findElements(By.tagName("a")).size());
		
		for(int i=1;i<column.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
			String parent=driver.getWindowHandle();
			Set<String> child=driver.getWindowHandles();
			
			Iterator<String> c=child.iterator();
			while(c.hasNext()) {
				String child_window=c.next();
				if(!parent.equals(child_window)) {
					driver.switchTo().window(child_window);
					System.out.println(driver.switchTo().window(child_window).getTitle());
					driver.close();
					}
			
		}
			driver.switchTo().window(parent);
	}

	}
}
