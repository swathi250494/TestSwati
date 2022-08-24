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
public class Landing {
	WebDriver driver;
	@Given("^user launches registration page$")
	public void user_launches_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
	}

	@Given("^observes the contents$")
	public void observes_the_contents() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.getCurrentUrl();
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	driver.close();
	}
	@Given("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//a[text()='"+arg1+"']")).click();
	}
	
}
