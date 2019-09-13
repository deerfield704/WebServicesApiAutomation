package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.ApiRunner;

public class singleStudentApi {
    @When("user hits single student API with {string}")
    public void userHitsSingleStudentAPIWith(String uri) {
        ApiRunner.runGET(uri);


    }

    @Then("user tests for required attributes")
    public void userTestsForRequiredAttributes() {
        System.out.println(ApiRunner.getResponse().getFirstName());
        System.out.println(ApiRunner.getResponse().getLastName());
        Assert.assertTrue(ApiRunner.getResponse().getFirstName()!=null);
        Assert.assertTrue(ApiRunner.getResponse().getLastName()!=null);
        Assert.assertTrue(ApiRunner.getResponse().getCompany()!=null);
    }

    @When("user tests the title of the student")
    public void userTestsTheTitleOfTheStudent() {

    }

    @Then("user should validate the title is present")
    public void userShouldValidateTheTitleIsPresent() {

    }

    @When("user tests the email")
    public void userTestsTheEmail() {

    }


    @Then("user should validate the right email")
    public void userShouldValidateTheRightEmail() {
    }
}