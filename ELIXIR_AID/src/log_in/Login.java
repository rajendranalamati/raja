package log_in;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Login {
 WebDriver driver;
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","D:\\sample\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("http://demo.elixiraid.com/index.php");
	  driver.manage().window().maximize();
  }
  @Test
  public void login() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  driver.findElement(By.xpath("//html//ul[@class='navigation navigation-main navigation-accordion']/li[3]/a[1]")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("9999");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).clear(); 
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).sendKeys("raja hospital");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).sendKeys("sr nagar");
	  new Select(driver.findElement(By.xpath("//select[@id='Hospitalregistration_yearofestablishment']"))).selectByVisibleText("1996");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']")).sendKeys("india");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']")).sendKeys("telangana");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']")).sendKeys("8309120051");
	 
  }
}
