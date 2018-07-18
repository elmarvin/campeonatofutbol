package Clases;

import java.sql.Date;

/**
 * @author JOSE LUIS
 * @version 1.0
 * @created 02-mar.-2018 19:36:02
 */
public class Campeonato {

    private int id_campeonato;
    private String Nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String Anio;

    public Campeonato() {
    }

    public Campeonato(int id_campeonato, String Nombre, Date fecha_inicio, Date fecha_fin, String Anio) {
        this.id_campeonato = id_campeonato;
        this.Nombre = Nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.Anio = Anio;
    }

    public int getId_campeonato() {
        return id_campeonato;
    }

    public void setId_campeonato(int id_campeonato) {
        this.id_campeonato = id_campeonato;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public void ActualizarAnio() {

    }

}
