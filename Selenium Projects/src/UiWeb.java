import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class UiWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//handling passenger field dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		
		//to add 4 adults we need to click '+' icon for 3 times
		//We should put sleep after dropdown because to open dropdown it will take 1 or 2 seconds
		Thread.sleep(2000L);
		//in order to add 4 adults we need to put in the loop using while loop 
		/*int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();//4 times the loop is clicked
			i++;
		}*/
		
		//Using For Loop 
		System.out.println("Passenger selected : "+driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<=4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		//Code for Child 
		for(int i=1; i<=3; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		//Code for Infants
		for(int i = 1; i<=2; i++){
			driver.findElement(By.id("hrefIncInf")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println("Passenger selected : "+driver.findElement(By.id("divpaxinfo")).getText());
		
		//Select dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		
		System.out.println("Before Currency taken : "+dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByIndex(3);
		System.out.println("Currency taken : "+dropdown.getFirstSelectedOption().getText());
	}
}
