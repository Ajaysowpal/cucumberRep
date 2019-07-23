package pack2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class snenario2 {
	@Given("I enter 50")
	public void I_enter_50()
	{
		System.out.println("I enter 50");
	}
	@And("I press add")
	public void I_press_add()
	{
		System.out.println("I press add");
	}
	@And("I have entered 50")
	public void I_have_entered_50()
	{
		System.out.println("And I have entered 50");
	}
	@When("I press equal")
	public void I_press_equal()
	{
		System.out.println("When I press equal");
	}
	@Then("result should be 100")
	public void result_should_be_100()
	{
		System.out.println("Then result should be 100");
	}
	@Given("I enter 20")
	public void I_enter_20()
	{
		System.out.println("I enter 20");
	}
	@And("I press sub")
	public void I_press_sub()
	{
		System.out.println("I press sub");
	}
	@And("I have entered 10")
	public void I_have_entered_10()
	{
		System.out.println("And I have entered 51");
	}
	@When("I press equals")
	public void I_press_equals()
	{
		System.out.println("When I press equal");
	}
	@Then("result should be 10")
	public void result_should_be_10()
	{
		System.out.println("Then result should be 10");
	}
}
