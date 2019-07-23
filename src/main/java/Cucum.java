import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucum {

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
}
