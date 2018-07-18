/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Colegio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jossy
 */
public class DatColegio {

    DatConexion con = new DatConexion();

    public ResultSet Consultar() throws ClassNotFoundException, SQLException {
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "select * from Colegio ";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public int InsertarColegios(Colegio objCol) throws ClassNotFoundException, SQLException {
        int nt = 1;
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "insert into Colegio values (0,'" + objCol.getCodigo() + "','" + objCol.getNombre() + "','" + objCol.getTelefono() + "','" + objCol.getRepresentante() + "')";
        System.out.println(Sentencia);
        nt = st.executeUpdate(Sentencia);
        return nt;
    }
}
