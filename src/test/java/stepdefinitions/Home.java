package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {
	WebDriver driver;
	@Given("user launches browser")
	public void user_launches_browser() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	  
	}

	@When("enters url")
	public void enters_url() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.demoblaze.com");
	}

	@Then("check the title")
	public void check_the_title() {
	    // Write code here that turns the phrase above into concrete actions
		driver.getTitle();
	}

	@Then("Check the links in the header section")
	public void check_the_links_in_the_header_section(DataTable dataTable) {
		List<String> d=dataTable.asList();
	////	String s=d.get(0);
	//	String s1=d.get(1);
	
		//	driver.findElement(By.xpath("//a[contains(text(),'"+d.get(0)+"')]")).isDisplayed();
		

	}

	@When("click on login link")
	public void click_on_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("login2")).click();
	}

	@When("Enter {string} and {string}")
	public void enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("loginusername")).sendKeys(string);
	  driver.findElement(By.id("loginpassword")).sendKeys(string2);
	  driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
	}
	@Then("user logs succesfully")
	public void user_logs_succesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
