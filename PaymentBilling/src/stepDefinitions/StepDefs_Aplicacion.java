package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_Aplicacion {
	
	static WebDriver driver; 

	@Given("el usuario esta conectado")
	public void estas_conectado() throws Exception{

	   System.setProperty("webdriver.chrome.driver","C:\\Jorge\\Apuntes\\TFG\\2018\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();  
	}

	@When("se carga la pagina principal de la aplicacion")
	public void cargo_la_aplicacion() throws Exception{

		driver.get("http://localhost:8081/PaymentBilling/");

	}

	@When("se carga la opcion nuevo registro")
	public void se_carga_la_opcion_nuevo_registro() {

        driver.findElement(By.id("generalinfo")).click();
        
	}
	
	@When("se carga la opcion modificacion")
	public void se_carga_la_opcion_modificacion() {

        driver.findElement(By.id("modify")).click();
        
	}

    @When("se carga la opcion administrador")
    public void se_carga_la_opcion_administrador() {

        driver.findElement(By.id("ahome")).click();
    
    }
    
    @When("se carga la opcion contacto")
    public void se_carga_la_opcion_contacto() {

        driver.findElement(By.id("contactus")).click();
    
    }
	@Then("se muestra la interfaz principal")
	public void se_muestra_la_interfaz_principal() throws Exception{

	    String expectedTitle = "Welcome Page";
	    String actualTitle = "";
		actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
			
	}
	
	@Then("se muestra la interfaz nuevo registro")
	public void se_muestra_la_interfaz_nuevo_registro() throws Exception{

	    String expectedTitle = "New Registration";
	    String actualTitle = "";
		actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
			
	}
	
	@Then("esta restringido a los administradores")
	public void esta_restringido_a_los_administradores() throws Exception{
		
		String expectedError = "Identificate primero";
	    boolean b = driver.getPageSource().contains(expectedError);
	    
	    assertTrue(b);
			
	}	
	
	@Then("se muestra la interfaz de contacto")
	public void se_muestra_la_interfaz_contacto() throws Exception{

	    String expectedTitle = "Contact Us";
	    String actualTitle = "";
		actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
			
	}
	
	@Before
	public void before(Scenario scenario) {
	    System.out.println("------------------------------");
	    System.out.println("Cargando escenario - " + scenario.getName());
	    System.out.println("------------------------------");
	}
	
	@After
	public void after(Scenario scenario) {
		System.out.println(" ");
	    System.out.println("------------------------------");
	    System.out.println("Terminando escenario - " + scenario.getName());
	    System.out.println("------------------------------");
	    driver.quit();
	}
}
