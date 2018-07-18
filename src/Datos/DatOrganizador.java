/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Entrenador;
import static Datos.DatConexion.con;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Karlita
 */
public class DatOrganizador {
    
    
    DatConexion con = new DatConexion();    
    
     public int Insertar(Entrenador objOr) throws ClassNotFoundException, SQLException {
        int nt = 1;
        Statement st = con.AbrirConexion().createStatement();
        System.out.println(" ");
        String Sentencia = "insert into Organizador values (0,'" + objOr.getCedula() + "','" + objOr.getNombre() + "','"
                + objOr.getApellido() + "','" + objOr.getDireccion() + "','" + objOr.getMail()
                + "','" + objOr.getUsuario() + "','" + objOr.getContrasena() + "')";
        System.out.println(Sentencia);
        nt = st.executeUpdate(Sentencia);
        return nt;
   
    }
}
