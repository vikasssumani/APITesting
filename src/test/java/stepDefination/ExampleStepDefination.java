package stepDefination;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import static org.hamcrest.Matchers.*;

import api.BaseClass;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;


public class ExampleStepDefination {
	
	public BaseClass bc;
	static ResponseOptions<Response> response;
	@Before
	public void setUp() {
		bc = new BaseClass();
	}
	
	@Given("user perform the get operation for {string}")
	public void user_perform_the_get_operation_for(String url) {
		response = BaseClass.getMethod(url);
	}

	@When("user gets a success response with {int}")
	public void user_gets_a_success_response_with(Integer int1) {
		//assertThat(int1, response.statusCode());
		System.out.println(response.statusCode());
	}

	@Then("verify the number of items in response as {int}")
	public void verify_the_number_of_items_in_response_as(Integer int1) {
		System.out.println(response.getBody().jsonPath().get("info"));
	}

}
