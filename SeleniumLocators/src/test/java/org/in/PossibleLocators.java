package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PossibleLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.guvi.in/register/");
		WebElement firstname=driver.findElement(By.tagName("input"));
		firstname.sendKeys("pradeep");
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys("R");
		WebElement email=driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
        email.sendKeys("prade@gmail.com");
        WebElement password=driver.findElement(By.cssSelector("input#passwordInput"));
        password.sendKeys("Rajkumar23@");
       WebElement mobile= driver.findElement(By.name("mobileNumberInput"));
       mobile.sendKeys("9655913337");
       WebElement signup=driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
       signup.click();
        
	}

}
