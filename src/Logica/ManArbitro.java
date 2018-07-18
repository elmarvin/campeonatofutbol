/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Arbitro;
import Datos.DatArbitro;
import java.sql.SQLException;

/**
 *
 * @author jossy
 */
public class ManArbitro {

    DatArbitro objDatArb = new DatArbitro();

    public int AgregarArbitro(Arbitro objArb) throws ClassNotFoundException, SQLException {

        int x = objDatArb.InsertarArbitro(objArb);
        return x;
    }
    
    public int ActualizarArbitro(Arbitro objArb) throws ClassNotFoundException, SQLException{
        
        int x = objDatArb.ActualizarArbitro(objArb);
        return x;       
    }
}
