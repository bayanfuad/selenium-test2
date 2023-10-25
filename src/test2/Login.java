package test2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends Parameters {

	static WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void SetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.get(LoginURL);
	};

	@Test(priority =2)
	public void Happy_Senario_Login() {

		WebElement EmailInput = driver.findElement(By.id("email"));
		WebElement PasswordInput = driver.findElement(By.id("pass"));
		EmailInput.sendKeys(RandomEmail);
		PasswordInput.sendKeys(Password);
		WebElement LoginButton = driver.findElement(By.id("send2"));
		LoginButton.click();
	};

	@AfterTest
	public void MyAfterTest() {
	};
}
