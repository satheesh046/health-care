package firsttestng;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hospital {
	WebDriver driver;
	@Test

	public void login() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.smart-hospital.in/admin/bill/dashboard");
		driver.manage().window().maximize();
		//Alert alert=
	
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
	driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[2]/a/span")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div[1]/div/div[2]/div/div[1]/div/a")).click();
	driver.findElement(By.id("add")).click();
	//casualty
	WebElement casu=driver.findElement(By.id("casualty"));
	casu.click();
	Select opt=new Select(casu);
	opt.selectByIndex(0);
	//driver.close();
	}
	
	

}
