package Clases;

/**
 * @author JOSE LUIS
 * @version 1.0
 * @created 02-mar.-2018 19:28:35
 */
public class Equipo {

    private int id_equipo;
    private String Categoria;
    private String Estado;
    private char Genero;
    private String NombreE;

    public Equipo() {
    }

    public Equipo(int id_equipo, String Categoria, String Estado, char Genero, String NombreE) {
        this.id_equipo = id_equipo;
        this.Categoria = Categoria;
        this.Estado = Estado;
        this.Genero = Genero;
        this.NombreE = NombreE;
    }
    public Equipo(int id_equipo, String NombreE, String Categoria, char Genero) {
        System.out.println(id_equipo+NombreE+Categoria+Genero);
        this.id_equipo = id_equipo;
        this.NombreE = NombreE;
        this.Categoria = Categoria;
        this.Genero = Genero;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

}
