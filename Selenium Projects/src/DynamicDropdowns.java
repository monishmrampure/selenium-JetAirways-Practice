import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Handling with dynamic Dropdowns
		driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		Thread.sleep(2000);
		
		//Taking values from DropDown
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//to avoid sync failures in TO Dropdown
		Thread.sleep(2000L);
		
		//Taking values from to DropDown
		//driver.findElement(By.xpath("(//a[@value = 'DEL'])[2]")).click();//Some of the real projects automation leads can reject for this line
		//where index is introduced, so Parent child concept come into picture**.
		
		// //div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value = 'DEL'] --> Xpath
		
		driver.findElement(By.cssSelector("div[id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value = 'HBX']")).click();
	}

}
