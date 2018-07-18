package Clases;

import java.sql.Date;

/**
 * @author JOSE LUIS
 * @version 1.0
 * @created 02-mar.-2018 19:36:04
 */
public class Calendario {

    private int id_calendario;
    private Date Fecha;

    public Calendario() {
    }

    public Calendario(int id_calendario, Date Fecha) {
        this.id_calendario = id_calendario;
        this.Fecha = Fecha;
    }

    public int getId_calendario() {
        return id_calendario;
    }

    public void setId_calendario(int id_calendario) {
        this.id_calendario = id_calendario;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

}
