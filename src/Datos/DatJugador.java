/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Jugador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class DatJugador {
    DatConexion con = new DatConexion();
    String query;
    
    public ResultSet Consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM paquete";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    //Metodo para Insertar los datos Jugador
    public int InsertarJugador(Jugador obj)throws SQLException {
        PreparedStatement resp = null;
        query = "INSERT INTO `futbolproyecto`.`Jugador` (`id_equipo_actual`, `cedula`, `nombre`, `apellido`, `direccion`, `mail`, `genero`, `posicion`, `edad`, `categoria`, `dorsal`) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
        try {
            resp = con.getConnection().prepareStatement(query);
            
            /*resp.setInt(1, obj.getLatitud());//id_equipo_actual
            resp.setString(2, obj.getLongitud());//cedula
            resp.setString(3, obj.getLongitud());//nombre
            resp.setString(4, obj.getLongitud());//apellido
            resp.setString(5, obj.getLongitud());//direccion
            resp.setString(6, obj.getLongitud());//mail
            resp.setString(7, obj.getLongitud());//genero
            resp.setString(8, obj.getLongitud());//posicion
            resp.setInt(9, obj.getLongitud());//edad
            resp.setString(10, obj.getLongitud());//categoria
            resp.setInt(11, obj.getLongitud());//dorsal*/           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return resp.executeUpdate();
    }
}
