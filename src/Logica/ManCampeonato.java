/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Campeonato;
import Datos.DatCampeonato;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jossy
 */
public class ManCampeonato {

    DatCampeonato objDatCamp = new DatCampeonato();

    public ArrayList<Campeonato> ListarCampeonato(ArrayList<Campeonato> ArrayCampeonato) throws ClassNotFoundException, SQLException {
        ArrayCampeonato.clear();
        ResultSet rs = objDatCamp.Consultar();
        while (rs.next()) {
            int idCamp = rs.getInt("id_campeonato");
            String nombre = rs.getString("nombre");
            Date fecha_inicio = rs.getDate("fecha_inicio");
            Date fecha_fin = rs.getDate("fecha_fin");
            String anio = rs.getString("anio");

            Campeonato objCam = new Campeonato(idCamp, nombre, fecha_inicio, fecha_fin, anio);
            ArrayCampeonato.add(objCam);
        }
        return (ArrayCampeonato);
    }

    public int AgregarCampeonato(Campeonato objCamp) throws ClassNotFoundException, SQLException {

        int x = objDatCamp.InsertarCampeonato(objCamp);
        return x;
    }

}
