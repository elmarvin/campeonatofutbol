package Clases;

public class Jugador extends Persona {

    private char Genero;
    private String Posicion;
    private int Edad;
    private String Categoria;
    private int Dorsal;

    public Jugador() {
    }

    public Jugador(String Cedula, String Nombre, String Apellido, String Direccion, String Mail, char Genero, String Posicion, int Edad, String Categoria, int Dorsal) {
        super(Cedula, Nombre, Apellido, Direccion, Mail);
        this.Genero = Genero;
        this.Posicion = Posicion;
        this.Edad = Edad;
        this.Categoria = Categoria;
        this.Dorsal = Dorsal;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }

}
