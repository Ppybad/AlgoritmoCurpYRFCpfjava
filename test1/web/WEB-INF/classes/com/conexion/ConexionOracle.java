/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pepe Ybad
 */
public class ConexionOracle 
{
        
       private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
       private final String URL = "jdbc:oracle:thin:@//localhost:1521/TEST";
       private final String USER = "TEST";
       private final String PASSWORD = "TEST";
       private final String USERG = "TEST";
       private final String PASSWORDG = "TEST";
       
//       private final String USERF = "TEST";
//       private final String PASSWORDF = "TEST";
       
       
     public Connection cadena;

      public ConexionOracle() {
       this.cadena = null;
      }
      
    public Connection conectar (){
      try{
       Class.forName(DRIVER);
       this.cadena = DriverManager.getConnection(URL, USER, PASSWORD);
           System.out.println("Connected to database!");
      }catch ( ClassNotFoundException | SQLException e){      
          JOptionPane.showMessageDialog(null, e.getMessage());
           System.out.println("Connected to error!");
          
      
       }
        return this.cadena;
      }
      public void desconectar() {
          try {
                this.cadena.close();
                System.out.println("disnnected to database!");
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }    
      }
      
      public Connection conectarG (){
      try{
       Class.forName(DRIVER);
       this.cadena = DriverManager.getConnection(URL, USERG, PASSWORDG);
           System.out.println("Connected to database!");
      }catch ( ClassNotFoundException | SQLException e){      
          JOptionPane.showMessageDialog(null, e.getMessage());
           System.out.println("Connected to error!");
          
      
       }
        return this.cadena;
      }
      public void desconectarG() {
          try {
                this.cadena.close();
                System.out.println("disnnected to database!");
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }    
      }
}
