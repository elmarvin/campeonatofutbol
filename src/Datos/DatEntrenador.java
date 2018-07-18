/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Entrenador;
import Clases.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jossy
 */
public class DatEntrenador {

    DatConexion con = new DatConexion();

    public ResultSet Consultar() throws ClassNotFoundException, SQLException {
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "select * from Entrenador ";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public int InsertarEntrenador(Entrenador objEntre) throws ClassNotFoundException, SQLException {
        int nt = 1;
        Statement st = con.AbrirConexion().createStatement();
        System.out.println("hola aun");
        String Sentencia = "insert into Entrenador values (0,'" + objEntre.getCedula() + "','" + objEntre.getNombre() + "','"
                + objEntre.getApellido() + "','" + objEntre.getDireccion() + "','" + objEntre.getMail()
                + "','" + objEntre.getFederacion() + "','" + objEntre.getUsuario() + "','" + objEntre.getContrasena() + "')";
        System.out.println(Sentencia);
        nt = st.executeUpdate(Sentencia);
        return nt;
    }
}
