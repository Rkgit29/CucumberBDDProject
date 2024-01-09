package com.facebook.stepsDefinitions;

import io.cucumber.java.en.*;
import org.facebbok.pages.LoginPage;

public class LoginPageStepDef {

    LoginPage lp = new LoginPage();

    @Given("I am the user of facebook application")
    public void i_am_the_user_of_facebook_application() throws Exception {
        lp.openURL();
    }

    @When("I enter valid username")
    public void i_enter_valid_username() {
        lp.enterUsername();
    }

    @When("I enter valid password")
    public void i_enter_valid_password() {
        lp.enterPassword();
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        lp.clickLoginbutton();
    }

    @Then("I should be able to login successfully")
    public void i_should_be_able_to_login_successfully() {
        lp.verfyLogin();
    }


}
