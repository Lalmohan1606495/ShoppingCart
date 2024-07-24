package shoppingCart.shoppingCart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shopingcartTest {
	
	WebDriver driver;
	
	@Test(priority=1)
	void openurl()
	{
		driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://rahulshettyacademy.com/client");
       driver.manage().window().maximize();
       System.out.println("open the shopping website");
       
       
      
	}
	@Test(priority=2)
	void loginwithregisteruser()
	{
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("lalmohan1606495@gmail.com"+Keys.TAB);
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Lal1606495@");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		System.out.println("user login with valid user name and password");
		
		
		
	}
	@Test(priority=3)
	void addingCart() throws InterruptedException
	{
		driver.findElement(By.xpath("(//button[@class='btn w-10 rounded'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		WebElement element=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
		if(element.isDisplayed())
		{
			System.out.println("item successfully added to the cart");
		}
		else
		{
			System.out.println("item not added to the cart");
		}
		driver.close();
		
	}
	

}
