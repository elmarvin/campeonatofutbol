/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Cancha;
import Datos.DatCancha;
import java.sql.SQLException;

/**
 *
 * @author jossy
 */
public class ManCancha {

    DatCancha objDatCan = new DatCancha();

    public int AgregarCancha(Cancha objColegio) throws ClassNotFoundException, SQLException {

        int x = objDatCan.InsertarCancha(objColegio);
        return x;
    }

}
