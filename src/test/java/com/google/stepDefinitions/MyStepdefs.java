package com.google.stepDefinitions;

import com.google.objects.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I'm on store page")
    public void iMOnStorePage() {
        System.out.println("I am on store Page");
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product productName)
    {
        System.out.println("Product Name is: " + productName.getProductName());
    }

    @Then("I see {int} {product} in the cart")
    public void iSeeInTheCart(int qty, Product productName) {
        System.out.println("Product Name is: " + productName.getProductName());
        System.out.println("Product Qty is: " + qty);
    }
}
