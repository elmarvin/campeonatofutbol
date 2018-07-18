/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Campeonato;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jossy
 */
public class DatCampeonato {

    DatConexion con = new DatConexion();

    public ResultSet Consultar() throws ClassNotFoundException, SQLException {
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "select * from campeonato ";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public int InsertarCampeonato(Campeonato objCamp) throws ClassNotFoundException, SQLException {
        int nt = 1;
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "insert into campeonato values (0,'" + objCamp.getNombre() + "','" + objCamp.getFecha_inicio() + "','" + objCamp.getFecha_fin() + "','" + objCamp.getAnio() + "')";
        System.out.println(Sentencia);
        nt = st.executeUpdate(Sentencia);
        return nt;
    }

}
