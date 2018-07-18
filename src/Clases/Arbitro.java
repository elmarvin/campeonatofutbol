/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jossy
 */
public class Arbitro extends Persona {

    private int id_arbitro;
    private String Posicion;

    public Arbitro() {
    }

    public Arbitro(int id_arbitro, String Cedula, String Nombre, String Apellido, String Direccion, String Mail, String Posicion) {
        super(Cedula, Nombre, Apellido, Direccion, Mail);
        this.id_arbitro = id_arbitro;
        this.Posicion = Posicion;
    }

    public int getId_arbitro() {
        return id_arbitro;
    }

    public void setId_arbitro(int id_arbitro) {
        this.id_arbitro = id_arbitro;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

}
