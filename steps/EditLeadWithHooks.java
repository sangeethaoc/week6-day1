package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import steps.BaseClass;

public class EditLeadWithHooks extends BaseClass {
	
	String compName="";

	@When("Click on Leads")
	public void clickLeadsTab() {
		// Click Leads tab
		driver.findElement(By.linkText("Leads")).click();
	}

	@Then("Click on Find Leads link")
	public void clickOnFindLeadsLink() {
		// Click Find Leads tab
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Given("First Name as {string}")
	public void enterFirstName(String firstName) {
		// Enter First Name
		driver.findElement(By.xpath("(//input[@name='firstName'])[last()]")).sendKeys(firstName);

	}

	@Then("Click on Find Leads button")
	public void clickOnFindLeadsButton() {
		// Click Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@When("Click on First Lead displayed")
	public void clickOnFirstLead() throws InterruptedException {
		Thread.sleep(3000);
		// Click First Lead
		WebElement leadIDWE = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]"));
		leadIDWE.click();
	}

	@Then("Click on Edit button")
	public void clickOnEditButton() {
		// Click Edit on View Lead page
		driver.findElement(By.xpath("//a[text()= 'Edit']")).click();

	}

	@Given("Enter Company Name as {string}")
	public void enterCompanyName(String companyName) 
	{
		// Change the Company Name
		compName = companyName;
		WebElement compNameWE = driver.findElement(By.id("updateLeadForm_companyName"));
		compNameWE.clear();
		compNameWE.sendKeys(companyName);
	}

	@When("Click on Update Button")
	public void clickUpdateButton() {
		// Click on Update
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Verify Company Name is updated")
	public void verifyViewLeadPage() {
		
		// Verify if the changed value displays in the View Lead page
		String updatedCompName = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if (updatedCompName != null && updatedCompName.startsWith(compName))
			System.out.println("The Company Name has been updated with its new value.");
		else
			System.out.println("The Company Name has not been updated with its new value.");

	}
}
