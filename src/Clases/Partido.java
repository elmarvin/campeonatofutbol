package Clases;

/**
 * @author JOSE LUIS
 * @version 1.0
 * @created 02-mar.-2018 19:31:28
 */
public class Partido {

    private int id_partido;
    private String codPartido;
    private String Equipo1;
    private String Equipo2;
    private String Hora;

    public Partido() {
    }

    public Partido(int id_partido, String codPartido, String Equipo1, String Equipo2, String Hora) {
        this.id_partido = id_partido;
        this.codPartido = codPartido;
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.Hora = Hora;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public String getCodPartido() {
        return codPartido;
    }

    public void setCodPartido(String codPartido) {
        this.codPartido = codPartido;
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public void setEquipo1(String Equipo1) {
        this.Equipo1 = Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public void setEquipo2(String Equipo2) {
        this.Equipo2 = Equipo2;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

}
