package hellocucumber.notimp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class StepDefinitions {
    @Given("the following people exist:")
    public void the_following_people_exist(io.cucumber.datatable.DataTable dataTable) {
        assertTrue(false);
    }
    @Given("some precondition {int}")
    public void some_precondition(Integer int1) {
    }
    @When("some other action")
    public void some_other_action() {
    }

    @Given("some precondition")
    public void some_precondition() {
    }
    @Given("some other precondition with doc string")
    public void some_other_precondition_with_doc_string(String docString) {
    }
    @When("some action by the actor")
    public void some_action_by_the_actor() {
    }
    @When("yet another action")
    public void yet_another_action() {
    }
    @Then("some testable outcome is achieved")
    public void some_testable_outcome_is_achieved() {
    }
    @Then("something else we can check happens too")
    public void something_else_we_can_check_happens_too() {
    }
    @Then("I don't see something else")
    public void i_don_t_see_something_else() {
    }



    @Given("a global administrator named {string}")
    public void a_global_administrator_named(String string) {
        // Write code here that turns the phrase above into concrete actions
        //////throw new io.cucumber.java.PendingException();
    }
    @Given("a blog named {string}")
    public void a_blog_named(String string) {
        // Write code here that turns the phrase above into concrete actions
//        ////throw new io.cucumber.java.PendingException();
    }
    @Given("a customer named {string}")
    public void a_customer_named(String string) {
        // Write code here that turns the phrase above into concrete actions
//        ////throw new io.cucumber.java.PendingException();
    }
    @Given("the cow weighs {int} kg")
    public void the_cow_weighs_kg(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        ////throw new io.cucumber.java.PendingException();
    }
    @When("we calculate the feeding requirements")
    public void we_calculate_the_feeding_requirements() {
        assertTrue(false);

        // Write code here that turns the phrase above into concrete actions
//        ////throw new io.cucumber.java.PendingException();
    }
    @Then("the energy should be {int} MJ")
    public void the_energy_should_be_mj(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        ////throw new io.cucumber.java.PendingException();
    }

}
