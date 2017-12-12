package dbpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/natixishr";
	    Properties props = new Properties();
	    props.setProperty("user", "root");
	    props.setProperty("password", "");
	  
	    Connection conn = DriverManager.getConnection(url,props);
	    
	
	    Statement insert = conn.createStatement();
		String sql = "INSERT INTO funcionarios VALUES (1234124, 'Joao', '1977-10-12', 'Rua santos pousada',"
				+ " 'Senior', 'Administrador')";
		insert.executeUpdate(sql);
	    
	
		Statement update = conn.createStatement();
	    String sql1 = "UPDATE funcionarios set morada = 'Rua Antonio' WHERE bi = 1234124 ";
	    update.executeUpdate(sql1);
	    
	      	      
	      Statement delete = conn.createStatement();
	      String sql2 = "DELETE FROM funcionarios WHERE bi = 1234124 ";
	      delete.executeUpdate(sql2);
	    

	}
	
	

	
}
