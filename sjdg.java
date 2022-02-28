import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcTii 

{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("maratha");
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("great");
		WebElement login = driver.findElement(By.id("loginButton"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		login.click();
		
		
	}

}
