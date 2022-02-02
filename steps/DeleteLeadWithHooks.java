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

public class DeleteLeadWithHooks extends BaseClass {
	
	String leadID = "";
	
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
	
	@When("Click on First Lead link displayed")
	public void clickOnFirstLead() throws InterruptedException {
		Thread.sleep(3000);
		// Click First Lead
		WebElement leadIDWE = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		leadID = leadIDWE.getText();
		leadIDWE.click();
	}
	
	@Then("Click on Delete button")
	public void clickOnDeleteButton()
	{
		//Click Delete Lead
		driver.findElement(By.className("subMenuButtonDangerous")).click();
	}
	
	@Given("Enter Lead ID")
	public void enterLeadID()
	{
		// Enter LeadID which was deleted in previous step
		driver.findElement(By.name("id")).sendKeys(leadID);
	}
	
	@When("Click on Find Leads button")
	public void clickOnFindLeadsButton()
	{
		// Click Find Leads button
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
	}
	
	
	@Then("Confirm the given Lead ID is deleted")
	public void confirmGivenLeadIDIsDeleted()
	{
		// Confirm if the lead is deleted successfully
		WebElement displayMsgWE = driver.findElement(By.className("x-paging-info"));
		String displayMsg = displayMsgWE.getText();
		System.out.println(("Display Message : "+displayMsg));
		if(displayMsg != null && displayMsg.equalsIgnoreCase("No records to display"))
			
			System.out.println("The given Lead ID " +leadID+ " was deleted successfully");
		
		else
			
			System.out.println("The given Lead ID " +leadID+ " was not deleted successfully");

	}	
}
