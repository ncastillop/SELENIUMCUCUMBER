package steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
  
  GooglePage google = new GooglePage();

  @Given("^navego a google$")
  public void navigateToGoogle(){
      google.navigateToGoogle();
  }

  @When("^Ingreso el criterio de busqueda$")
  public void enterSearchCriteria(){
      //google.enterSearchCriteria("google");
  }

  @And("^presiono el boton de busqueda$") 
  public void clickSearchButton(){
    //google.clickButtonSearch();
  }

  @Then("^Obtengo resultados$")
  public void validateResults(){
    //Assert.assertEquals("Google",google.firsResult());
  }


}