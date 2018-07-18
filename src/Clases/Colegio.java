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
public class Colegio {

    private int CodColegio;
    private String Codigo;
    private String Nombre;
    private String Telefono;
    private String Representante;

    public Colegio() {
    }

    public Colegio(int CodColegio, String Codigo, String Nombre, String Telefono, String Representante) {
        this.CodColegio = CodColegio;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Representante = Representante;
    }

    public int getCodColegio() {
        return CodColegio;
    }

    public void setCodColegio(int CodColegio) {
        this.CodColegio = CodColegio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

}
