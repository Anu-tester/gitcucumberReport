package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPageTeststepdefinitions {

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page()  {
	  System.out.println("\"^user is already on Login Page$\"");
	}

	@When("^Check Customer Login Page title valid$")
	public void check_Customer_Login_Page_title_valid() {
		  System.out.println("\"^user is already on Login Page$\"");
	}

	@Then("^Check Customer Login with valid Data\"([^\"]*)\" and \"([^\"]*)\"$")
	public void check_Customer_Login_with_valid_Data_and(String arg1, String arg2)  {
		  System.out.println("\"^user is already on Login Page$\"");
	}

	@Then("^Check Customer Login with invalid Data\"([^\"]*)\" and \"([^\"]*)\"$")
	public void check_Customer_Login_with_invalid_Data_and(String arg1, String arg2)  {
		  System.out.println("\"^user is already on Login Page$\"");
	}

	@Given("^user is already on data table Login Page$")
	public void user_is_already_on_data_table_Login_Page()  {
		  System.out.println("\"^user is already on Login Page$\"");
	}

	@Then("^Check Customer Login with valid Data$")
	public void check_Customer_Login_with_valid_Data(DataTable arg1)  {
		  System.out.println("\"^user is already on Login Page$\"");
	}

}
