/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Charlie
 */
public class conectar {
    Connection conect = null;
	public Connection conexion()
		{
			try {
				//Cargamos el Driver MySQL
				Class.forName("com.mysql.jdbc.Driver");
				
				conect = DriverManager.getConnection("jdbc:mysql://localhost:3308/proyecto","root","");
				System.out.println("conexion establecida");
				
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("error de conexion");
				JOptionPane.showMessageDialog(null,"Error de conexion: "+e);
			}
			return conect;
		}
    
}
