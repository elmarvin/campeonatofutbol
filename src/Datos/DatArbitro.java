/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Arbitro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jossy
 */
public class DatArbitro {

    DatConexion con = new DatConexion();

    public ResultSet Consultar() throws ClassNotFoundException, SQLException {
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "select * from Arbitro ";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public int InsertarArbitro(Arbitro objAr) throws ClassNotFoundException, SQLException {
        int nt = 1;
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "insert into Arbitro values (0,'"
                + objAr.getCedula() + "','" + objAr.getNombre() + "','" + objAr.getApellido() + "','" + objAr.getDireccion() + "','" + objAr.getMail() + "','" + objAr.getPosicion() + "')";

        System.out.println(Sentencia); // presenta si está bien o mal la sentencia
        nt = st.executeUpdate(Sentencia);
        return nt;
    }
    
    public int ActualizarArbitro(Arbitro objAr) throws ClassNotFoundException, SQLException
    {
        int nt = 1;
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "update Arbitro set codigo = '"+
                objAr.getCedula()+"',nombre='"+objAr.getNombre()+"',apellido='"+objAr.getApellido()+"',direccion='"+objAr.getDireccion()+"',mail='"+objAr.getMail()+"',posicion='"+objAr.getPosicion()
                +"' where idAr ="+objAr.getId_arbitro();

        System.out.println(Sentencia);
        nt = st.executeUpdate(Sentencia);
        return nt;
    }
    
    
 
}
