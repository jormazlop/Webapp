package jUnitTests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	
	 public ResultSet rs;
	 
	    public boolean consultarstudent() {

	        try {
	        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC","root","root");
	            PreparedStatement stmt = con
	                    .prepareStatement("select id from student2");;
	            rs = stmt.executeQuery();
	            con.close();
	        } catch (SQLException e) {
	            return false;
	        }
			return true;
	    }

	    public boolean consultarpayregister() {

	        try {
	        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC","root","root");
	            PreparedStatement stmt = con
	                    .prepareStatement("select * from payregister");;
	            rs = stmt.executeQuery();
	            con.close();
	        } catch (SQLException e) {
	            return false;
	        }
			return true;
	    }

	 public boolean crearPayregister() {
	        try {
	        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC","root","root");
	        	con.setAutoCommit(false);
	            PreparedStatement stmt = con
	            .prepareStatement("insert into payregister values(00000, 'JUnit', 'JUnit', 'JUnit', '01/01/1990', '01/01/1990', 9999)");
	            stmt.executeUpdate();
	            con.rollback();
	            con.close();
	        }
	        catch (SQLException e) {
	            return false;
	        }	     
	        return true;
	    }
	 
	 public boolean crearStudent() {
	        try {
	        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC","root","root");
	        	con.setAutoCommit(false);
	            PreparedStatement stmt = con
	            .prepareStatement("insert into student2 values(00000, 'JUnit', 'JUnit', '12345', 'JUnit',"
	            	            + " 'JUnit', '100', '50', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit')");
	            stmt.executeUpdate();
	            con.rollback();
	            con.close();
	        }
	        catch (SQLException e) {
	            return false;
	        }	     
	        return true;
	    }

	 public boolean borrarPayregister() {
	        try {
	        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC","root","root");
	        	con.setAutoCommit(false);
	            PreparedStatement stmt = con
	            .prepareStatement("insert into payregister values(00000, 'JUnit', 'JUnit', 'JUnit', '01/01/1990', '01/01/1990', 9999)");
	            stmt.executeUpdate();
	            stmt = con
	            .prepareStatement("delete from payregister where username = 'JUnit';");   
	            stmt.executeUpdate();
	            con.rollback();
	            con.close();
	        }
	        catch (SQLException e) {
	            return false;
	        }	     
	        return true;
	    }

	 public boolean borrarStudent() {
	        try {
	        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC","root","root");
	        	con.setAutoCommit(false);
	            PreparedStatement stmt = con
	    	    .prepareStatement("insert into student2 values(00000, 'JUnit', 'JUnit', '12345', 'JUnit',"
	            	            + " 'JUnit', '100', '50', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit')");
	            stmt.executeUpdate();
	            stmt = con
	            .prepareStatement("delete from student2 where name = 'JUnit';");   
	            stmt.executeUpdate();
	            con.rollback();
	            con.close();
	        }
	        catch (SQLException e) {
	            return false;
	        }	     
	        return true;
	    }

	 public boolean actualizarPayregister() {
	        try {
	        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC","root","root");
	        	con.setAutoCommit(false);
	            PreparedStatement stmt = con
	            .prepareStatement("insert into payregister values(00000, 'JUnit', 'JUnit', 'JUnit', '01/01/1990', '01/01/1990', 9999)");
	            stmt.executeUpdate();
	            stmt = con
	            .prepareStatement("update payregister set userpass = 'JUnit2' where username = 'JUnit';");   
	            stmt.executeUpdate();
	            con.rollback();
	            con.close();
	        }
	        catch (SQLException e) {
	            return false;
	        }	     
	        return true;
	    }
	 
	 public boolean actualizarStudent() {
	        try {
	        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC","root","root");
	        	con.setAutoCommit(false);
	            PreparedStatement stmt = con
	    	    .prepareStatement("insert into student2 values(00000, 'JUnit', 'JUnit', '12345', 'JUnit',"
	            	            + " 'JUnit', '100', '50', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit', 'JUnit')");
	            stmt.executeUpdate();
	            stmt = con
	            .prepareStatement("update student2 set course = 'JUnit2' where name = 'JUnit';");   
	            stmt.executeUpdate();
	            con.rollback();
	            con.close();
	        }
	        catch (SQLException e) {
	            return false;
	        }	     
	        return true;
	    }
	 
}
