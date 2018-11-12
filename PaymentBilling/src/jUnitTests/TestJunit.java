package jUnitTests;   

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.mockito.Mock;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Description;

public class TestJunit{
	
    @Mock
    private Connection c;
    @Mock
    private PreparedStatement stmt;
    @Mock
    private ResultSet rs;


    @Test
    @Feature("Consultar tabla de estudiantes")
    @Description("Se comprueba que las consultas de estudiantes funcione correctamente")
    @Severity(SeverityLevel.BLOCKER)
    public void QueryStudent() throws Exception {
    	Database dao = new Database();
        assertTrue(dao.consultarstudent());
    }

    @Test
    @Feature("Consultar tabla de pagos")
    @Description("Se comprueba que las consultas de pagos de estudiantes funcionen correctamente")
    @Severity(SeverityLevel.BLOCKER)
    public void QueryPayRegister() throws Exception {
    	Database dao = new Database();
        assertTrue(dao.consultarpayregister());

    }
     
    @Test
    @Feature("Insertar tabla de pagos")
    @Description("Se comprueba que las inserciones de pagos de estudiantes funcionen correctamente")
    @Severity(SeverityLevel.CRITICAL)
    public void insertarPayRegister() throws Exception {
    	Database dao = new Database();
        assertTrue(dao.crearPayregister());

    }

    @Test
    @Feature("Insertar tabla de estudiantes")
    @Description("Se comprueba que las inserciones de nuevos estudiantes funcione correctamente")
    @Severity(SeverityLevel.CRITICAL)
    public void insertarStudent() throws Exception {
    	Database dao = new Database();
        assertTrue(dao.crearStudent());

    }
    
    @Test
    @Feature("Borrar tabla de pagos")
    @Description("Se comprueba que los borrados de pagos de estudiantes funcionen correctamente")
    @Severity(SeverityLevel.MINOR)
    public void borrarPayRegister() throws Exception {
    	Database dao = new Database();
        assertTrue(dao.borrarPayregister());

    }

    @Test
    @Feature("Borrar tabla de estudiantes")
    @Description("Se comprueba que los borrados de estudiantes funcione correctamente")
    @Severity(SeverityLevel.MINOR)
    public void borrarStudent() throws Exception {
    	Database dao = new Database();
        assertTrue(dao.borrarStudent());

    }
   
    @Test
    @Feature("Actualizar tabla de pagos")
    @Description("Se comprueba que la actualizacion de pagos de estudiantes funcionen correctamente")
    @Severity(SeverityLevel.NORMAL)
    public void actualizarPayregister() throws Exception {
    	Database dao = new Database();
        assertTrue(dao.actualizarPayregister());

    }

    @Test
    @Feature("Actualizar tabla de estudiantes")
    @Description("Se comprueba que la actualizacion de estudiantes funcione correctamente")
    @Severity(SeverityLevel.NORMAL)
    public void actualizarStudent() throws Exception {
    	Database dao = new Database();
        assertTrue(dao.actualizarStudent());
      
    }
}
	 
	
