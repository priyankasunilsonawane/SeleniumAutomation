import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='trending-naukri-wdgt']/div/div[2]/a[3]")).click();
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
