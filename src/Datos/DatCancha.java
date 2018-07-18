/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Cancha;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jossy
 */
public class DatCancha {

    DatConexion con = new DatConexion();

    public ResultSet Consultar() throws ClassNotFoundException, SQLException {
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "select * from Cancha ";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public int InsertarCancha(Cancha objCan) throws ClassNotFoundException, SQLException {
        int nt = 1;
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "insert into Cancha values (0,'" + objCan.getNombre() + "','" + objCan.getDireccion() + "')";
        System.out.println(Sentencia);
        nt = st.executeUpdate(Sentencia);
        return nt;
    }

}
