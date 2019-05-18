package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Description;

public class TestSelenium {
	
	static WebDriver driver; 
	
	@BeforeAll
	public static void init(){
		
	System.setProperty("webdriver.chrome.driver","C:\\Jorge\\Apuntes\\TFG\\2018\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	
	@Test	
    @Feature("Pagina principal")
    @Description("Se comprueba que la interfaz principal se cargue correctamente")
    @Severity(SeverityLevel.BLOCKER)
	public void titulo() {			

	    String baseUrl = "http://localhost:8081/PaymentBilling/";
	    String expectedTitle = "Welcome Page";
	    String actualTitle = "";

	    // launch Firefox and direct it to the Base URL
	    driver.get(baseUrl);

	    // get the actual value of the title
	    actualTitle = driver.getTitle();

		assertEquals(actualTitle, expectedTitle);
	       
	}
	
	@Test	
    @Feature("Pagina de Nuevo Registro")
    @Description("Se comprueba que la interfaz de registro se cargue correctamente")
    @Severity(SeverityLevel.MINOR)
	public void registro() {			

	    String baseUrl = "http://localhost:8081/PaymentBilling/";
	    String expectedTitle = "New Registration";
	    String actualTitle = "";

	    // Lanza Firefox y redirecciona a la URL base
	    driver.get(baseUrl);

	    // Cambia a la pestaña nuevo registro
        driver.findElement(By.id("generalinfo")).click();
        
	    actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	       
	}
	
	@Test	
    @Feature("Pagina de Modificar")
    @Description("Se comprueba que la interfaz de modificar este limitada a los administradores")
    @Severity(SeverityLevel.NORMAL)
	public void modificar() {			

	    String baseUrl = "http://localhost:8081/PaymentBilling/";

	    String expectedError = "Identificate primero";
	    
	    // Lanza Firefox y redirecciona a la URL base
	    driver.get(baseUrl);
	    
	    // Accede a la pestaña modificar
        driver.findElement(By.id("modify")).click();

	    boolean b = driver.getPageSource().contains(expectedError);
	    
	    assertTrue(b);
	    
	}

	@Test	
    @Feature("Pagina de Administrador")
    @Description("Se comprueba que la interfaz de administrador no este visible para los usuarios normales")
    @Severity(SeverityLevel.NORMAL)
	public void admin() {			

	    String baseUrl = "http://localhost:8081/PaymentBilling/";

	    String expectedError = "Identificate primero";

	    // Lanza Firefox y redirecciona a la URL base
	    driver.get(baseUrl);
	    
	    // Accede a la pestaña admin
        driver.findElement(By.id("ahome")).click();
        

	    boolean b = driver.getPageSource().contains(expectedError);
	    
	    assertTrue(b);
	       
	}
	
	@Test	
    @Feature("Pagina de Contacto")
    @Description("Se comprueba que la interfaz de contacto este visible para todos los usuarios")
    @Severity(SeverityLevel.CRITICAL)
	public void contacto() {			

	    String baseUrl = "http://localhost:8081/PaymentBilling/";
	    String expectedTitle = "Contact Us";
	    String actualTitle = "";

	    // Lanza Firefox y redirecciona a la URL base
	    driver.get(baseUrl);
	    

	    // Accede a la pestaña contacto
        driver.findElement(By.id("contactus")).click();
	    actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	       
	}
	
	@AfterAll
	public static void cleanUp(){
		
	     //Cerrar Firefox
	      driver.quit();
	      
	}
}

