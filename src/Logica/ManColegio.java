/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Colegio;
import Datos.DatColegio;
import java.sql.SQLException;

/**
 *
 * @author jossy
 */
public class ManColegio {

    DatColegio objDatCol = new DatColegio();

    public int AgregarColegio(Colegio objColegio) throws ClassNotFoundException, SQLException {

        int x = objDatCol.InsertarColegios(objColegio);
        return x;
    }

}
