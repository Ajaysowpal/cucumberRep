package CaseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaseStudy1 {
	WebDriver driver;

@Given("open TestMeAPP")
public void open_TestMeAPP() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
	
    
}

@Then("click signup")
public void click_signup() {
    driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
}

@Then("Enter username as {string}")
public void enter_username_as(String uname) {
	driver.findElement(By.name("userName")).sendKeys(uname);
}

@Then("Enter firstname as {string}")
public void enter_firstname_as(String fname) {
	driver.findElement(By.name("firstName")).sendKeys(fname);
}

@Then("Enter lastname as {string}")
public void enter_lastname_as(String lname) {
	driver.findElement(By.name("lastName")).sendKeys(lname);
}

@Then("Enter password as {string}")
public void enter_password_as(String pass) {
	driver.findElement(By.name("password")).sendKeys(pass);
}

@Then("Enter againpassword as {string}")
public void enter_againpassword_as(String cpass) {
	driver.findElement(By.name("confirmPassword")).sendKeys(cpass);
}

@Then("Enter Gender")
public void enter_Gender() {
	driver.findElement(By.xpath("//*[@id='gender']")).click();
	//*[@id="gender"]
}

@Then("Enter email as {string}")
public void enter_email_as(String mail) {
	driver.findElement(By.name("emailAddress")).sendKeys(mail);

}

@Then("Enter mobile as{string}")
public void enter_mobile_as(String num) {
	driver.findElement(By.name("mobileNumber")).sendKeys(num);

}

@Then("Enter dob as {string}")
public void enter_dob_as(String DOB) {
	driver.findElement(By.name("dob")).sendKeys(DOB);

}

@Then("Enter add as {string}")
public void enter_add_as(String sques) {
	driver.findElement(By.name("address")).sendKeys(sques);

}

@Then("Enter securityQuestion")
public void enter_securityQuestion() {
	WebElement dd = driver.findElement(By.xpath("//*[@id='securityQuestion']"));
	Select s = new Select(dd);
	s.selectByIndex(3);

}

@Then("Enter security answer")
public void enter_security_answer() {
	driver.findElement(By.name("answer")).sendKeys("Abibaby");
}

@Then("register")
public void register() {
	driver.findElement(By.name("Submit")).click();
}

@Then("quit")
public void quit() {
    driver.close();
}


}
