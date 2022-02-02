package steps;

import java.time.Duration;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadWithHooks  extends BaseClass{
	

	@When("Click on Leads")
	public void clickLeadsTab() {
		// Click Leads tab
		driver.findElement(By.linkText("Leads")).click();
	}

	@Then("Click on Create Lead")
	public void clickCreateLead() {
		// Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter Company Name as {string}")
	public void enterCompanyName(String companyName) {
		// Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}

	@Given("Enter First Name as {string}")
	public void enterFirstName(String firstName) {
		// Enter First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@Given("Enter Last Name as {string}")
	public void enterLastName(String lastName) {
		// Enter Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@Given("Enter E-mail as {string}")
	public void enterEmail(String email) {
		// Enter Email Address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}

	@When("Click Create Lead Submit button")
	public void clickSubmit() {
		// Click Create Lead button
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Verify View Lead page is displayed")
	public void verifyViewLead() {
		String pageTitle = driver.getTitle();

		// Print Page Title if
		if (pageTitle.startsWith("View Lead")) {
			System.out.println("Page Title Received is as expected");
			System.out.println("Page Title : " + driver.getTitle());
		} else
			System.out.println("Page Title is not as expected");
	}

}
