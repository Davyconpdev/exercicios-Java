package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {
    public Connection Conexaobd(){
        
        Connection con = null;
    
        try{            
            String url = "jdbc:mysql://localhost/dados?user=root&password";
            con = DriverManager.getConnection(url);
    
        }catch(SQLException erro){
    
           JOptionPane.showMessageDialog(null,erro.getMessage());       
        }
    
    return con;
    }  
}
