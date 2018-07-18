/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class DatEquipo {
    DatConexion con = new DatConexion();
    private Object Level;
    //permite abrir la comunicacion con la BD
    Statement sentencia;
    String query;
    public ResultSet ConsultaEquipo() throws ClassNotFoundException {
        ResultSet rs = null;
        Statement sentencia = null;
        try {  
            sentencia = (Statement) con.getConnection().createStatement();       
            String query = "SELECT id_equipo,nombre,categoria,genero FROM futbolproyecto.Equipo where estado='activo';";
            rs = sentencia.executeQuery(query);            
        } catch (SQLException ex) {
            Logger.getLogger(DatEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return rs;
    }
}
