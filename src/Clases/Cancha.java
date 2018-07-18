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
public class Cancha {

    private int id_cancha;
    private String Nombre;
    private String Direccion;

    public Cancha() {
    }

    public Cancha(int id_cancha, String Nombre, String Direccion) {
        this.id_cancha = id_cancha;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public void setId_cancha(int id_cancha) {
        this.id_cancha = id_cancha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

}
