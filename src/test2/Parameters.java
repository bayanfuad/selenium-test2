package test2;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {

	static Random Rand = new Random();
	static String FirstNames[] = { "Bayan", "Anas", "Ahmad", "Ayla" };
	static String LastNames[] = { "Jawawdeh", "Zaatreh", "Omar", "Tareq" };
	static int RandomIndexNames = Rand.nextInt(4);
	static int RandomIDForEmails = Rand.nextInt(1000);
	static String RandomEmail = GenerateRandomEmail();
	static String Password = "Bayan123#";
	
	static WebDriver driver = new ChromeDriver();

	static String TheURL = "https://magento.softwaretestingboard.com/";

	static String LoginURL = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/";

	static String SignupURL = "https://magento.softwaretestingboard.com/customer/account/create/";

	static String GenerateRandomFirstName() {
		String RandomFirstName = FirstNames[RandomIndexNames];
		return RandomFirstName;
	}

	static String GenerateRandomLastName() {
		String RandomLastName = LastNames[RandomIndexNames];
		return RandomLastName;
	}

	static String GenerateRandomEmail() {
		String Email = FirstNames[RandomIndexNames] + LastNames[RandomIndexNames] + RandomIDForEmails + "@gmail.com";
		return Email;
	}

}
