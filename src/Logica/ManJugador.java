/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Datos.DatJugador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ManJugador {

    DatJugador objJugador = new DatJugador();

    public int RegistrarJugador(int id_equipo_actual, String cedula, String nombre, String apellido, String direccion, String mail, char genero, String posicion, int edad, String categoria, int dorsal) throws ClassNotFoundException {
        int respuesta = 0;
        try {
            //cargar obj jugador
            Jugador obj = new Jugador(cedula, nombre, apellido, direccion, mail, genero, posicion, edad, categoria, dorsal);
            respuesta = objJugador.InsertarJugador(obj);//envio el obj cargado a DatJugador
        } catch (SQLException ex) {
            Logger.getLogger(ManJugador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return respuesta;

    }

}
