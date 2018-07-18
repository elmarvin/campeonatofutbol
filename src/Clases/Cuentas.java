package Clases;

/**
 * @author JOSE LUIS
 * @version 1.0
 * @created 02-mar.-2018 18:34:34
 */
public class Cuentas extends Persona {

    private int id_usuario;
    private String Usuario;
    private String Contrasena;

    public Cuentas() {
    }

    public Cuentas(int id_usuario, String Cedula, String Nombre, String Apellido, String Direccion, String Mail, String Usuario, String Contrasena) {
        super(Cedula, Nombre, Apellido, Direccion, Mail);
        this.id_usuario = id_usuario;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

}
