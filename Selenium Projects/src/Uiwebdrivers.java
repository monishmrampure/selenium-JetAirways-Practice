import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Uiwebdrivers {
	public static void main(String[] ars) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//To get the select dropdown from the static dropdown field
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		
		//Now there are lot of arguments available for select (Dropdown) methods
		dropdown.selectByIndex(2);
		System.out.println("Currency selected is : "+dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("USD");
		System.out.println("Currency selected is : "+dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		System.out.println("Currency selected is : "+dropdown.getFirstSelectedOption().getText());
		
		
		//if we try to deselect the dropdown options using "deselect by any method" for static dropdowns
		//Error is displayed : you may only deselect options of a multi select
		
			
	}

}
