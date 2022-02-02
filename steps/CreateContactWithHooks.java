package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateContactWithHooks extends BaseClass 
{
	@When("Click on Contacts")
	public void clickOnContacts() {
		// Click Contacts tab
		driver.findElement(By.linkText("Contacts")).click();
	}

	@Then("Click on Create Contact link")
	public void clickOnCreateContactLink() {
		// Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
	}

	@Given("Enter First Name as {string}")
	public void enterFirstName(String firstName) {
		// Enter First Name
		WebElement firstNameWE = driver.findElement(By.id("firstNameField"));
		firstNameWE.sendKeys(firstName);
	}

	@And("Enter Last Name as {string}")
	public void enterLastName(String lastName) {
		// Enter Last Name
		driver.findElement(By.id("lastNameField")).sendKeys(lastName);
	}

	@And("Enter First Name Local as {string}")
	public void enterFirstNameLocal(String firstNameLocal) {
		// Enter FirstName(Local)
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sangee");

	}

	@And("Enter Last Name Local as {string}")
	public void enterLastNameLocal(String lastNameLocal) {
		// Enter LastName(Local)
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Mathi");

	}

	@And("Enter Department Name as {string}")
	public void enterDepartmentName(String departmentName) {
		// Enter Department Name
		driver.findElement(By.name("departmentName")).sendKeys("IT");

	}

	@And("Enter Description as {string}")
	public void enterdescription(String description) {
		// Enter description
		driver.findElement(By.name("description")).sendKeys("Information Technology");
	}

	@And("Enter Email Address as {string}")
	public void enterEmailAddress(String emailAddress) {
		// Enter Primary Email
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys(emailAddress);

	}

	@And("Enter State Province as {string}")
	public void enterStateProvince(String stateProvince) {
		// Select State/Province as NewYork Using Visible Text
		WebElement stateProvinceWE = driver
				.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));

		Select stateProvinceSelect = new Select(stateProvinceWE);
		stateProvinceSelect.selectByVisibleText(stateProvince);

	}

	@When("Click Create Contact Submit button")
	public void clickCreateContactButton() {
		// Click CreateContact button
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Verify View Contact page displayed")
	public void verifyViewContactPage() 
	{
		// Print Browser Title
		String title = driver.getTitle();
		if(title != null && title.contains("View Contact"))
		{
			System.out.println("The page displayed is as expected : "+title);
		}
		else
			System.out.println("The page displayed is not as expected : "+title);
	}

}
