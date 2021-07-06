import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Script written for handling Checkboxes
		
		//input[name= 'ctl00$mainContent$chk_friendsandfamily']
		
		System.out.println("Boolean value for checkbox is : "+driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		
		//To identify the method, checkbox is selected or not
		System.out.println("Boolean value for checkbox is : "+driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());//it prints boolean true or false
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
		System.out.println("Boolean value for checkbox is : "+driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		System.out.println("Boolean value for checkbox is : "+driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		System.out.println("Boolean value for checkbox is : "+driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id*='Unmr']")).click();
		System.out.println("Boolean value for checkbox is : "+driver.findElement(By.cssSelector("input[id*='Unmr']")).isSelected());
		
		//Inorder to count the total number of checkboxes are present 
		System.out.println("Total no of Checkboxes : "+driver.findElements(By.xpath("//input[@type = 'checkbox']")).size());//to print the count 	
	}

}
