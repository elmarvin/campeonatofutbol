/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.DatEquipo;
import Clases.Equipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ManEquipo {
    DatEquipo objDE =new DatEquipo();
    
    ResultSet rs;
    public ArrayList <Equipo> ConsultaEquipo() throws SQLException { 
        ArrayList<Equipo> listaequipo= new ArrayList<>();
        try {                
            rs = objDE.ConsultaEquipo();// metodo en DatEquipo                     
            while (rs.next()) {
                Equipo obj = new Equipo(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4).charAt(0) );
                listaequipo.add(obj);//se almacena equipo en un array lists
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaequipo;//retornamos la lista equipo
    }
}
