package test2;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp extends Parameters {
	@BeforeTest
	public void SetUp() {
		driver.get(SignupURL);
	};

	@Test(priority =1)
	public void Happy_Senario_Signup() {
		WebElement FirstNameInput = driver.findElement(By.id("firstname"));
		FirstNameInput.sendKeys(GenerateRandomFirstName());

		WebElement LastNameInput = driver.findElement(By.id("lastname"));
		LastNameInput.sendKeys(GenerateRandomLastName());

		WebElement EmailInput = driver.findElement(By.id("email_address"));
		EmailInput.sendKeys(GenerateRandomEmail());

		WebElement PasswordInput = driver.findElement(By.id("password"));
		PasswordInput.sendKeys(Password);

		WebElement PasswordConfimInput = driver.findElement(By.id("password-confirmation"));
		PasswordConfimInput.sendKeys(Password);
		
		WebElement CreateAccountButton = driver.findElement(By.cssSelector("button[title='Create an Account']"));
		CreateAccountButton.click();
	};

	@Test()
	public void Sad_Senario_Signup() {
		
		WebDriver driver =new ChromeDriver(); 
		driver.get(SignupURL);
		
//		WebElement FirstNameInput = driver.findElement(By.id("firstname"));
//		FirstNameInput.sendKeys(GenerateRandomFirstName());

		WebElement LastNameInput = driver.findElement(By.id("lastname"));
		LastNameInput.sendKeys(GenerateRandomLastName());

		WebElement EmailInput = driver.findElement(By.id("email_address"));
		EmailInput.sendKeys(GenerateRandomEmail());

		WebElement PasswordInput = driver.findElement(By.id("password"));
		PasswordInput.sendKeys(Password);

		WebElement PasswordConfimInput = driver.findElement(By.id("password-confirmation"));
		PasswordConfimInput.sendKeys(Password);
		
		WebElement CreateAccountButton = driver.findElement(By.cssSelector("button[title='Create an Account']"));
		CreateAccountButton.click();
		System.out.println("sad senario test is done!");
	};
	@AfterTest
	public void MyAfterTest() {
	};
}
