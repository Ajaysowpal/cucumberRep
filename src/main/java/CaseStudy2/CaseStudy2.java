package CaseStudy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaseStudy2 {
WebDriver driver;
@Given("open the app")
public void open_the_app() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
	
}

@Then("click signin")
public void click_signin() {
    driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}

@Then("type {string}")
public void type(String uname) {
	driver.findElement(By.name("userName")).sendKeys(uname);
}

@And("types {string}")
public void types(String pass) {
	driver.findElement(By.name("password")).sendKeys(pass);
}

@Then("clickLogin")
public void clicklogin() {
	driver.findElement(By.name("Login")).click();
}
@Then("clickLogout")
public void clickLogout(){
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/a")).click();
	driver.close();
}

}
