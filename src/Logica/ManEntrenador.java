/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Entrenador;
import Datos.DatEntrenador;
import java.sql.SQLException;

/**
 *
 * @author jossy
 */
public class ManEntrenador {
    DatEntrenador objDatEntre = new DatEntrenador();
    
    public int AgregarEntrenador(Entrenador objEntre) throws ClassNotFoundException, SQLException{
        int x = objDatEntre.InsertarEntrenador(objEntre);
        return x;
    }
}
