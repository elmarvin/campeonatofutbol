
package Clases;


/**
 * @author JOSE LUIS
 * @version 1.0
 * @created 02-mar.-2018 18:34:35
 */
public class Entrenador extends Persona {

        private int idEntrenador;
	private String Federacion;
	private String Usuario;
	private String Contrasena;

        public Entrenador(int idEntrenador, String Cedula, String Nombre, String Apellido, String Direccion, String Mail,//atributos persona
                          String Federacion, String Usuario, String Contrasena) {//atributos entrenador
            super(Cedula, Nombre, Apellido, Direccion, Mail);
            this.idEntrenador = idEntrenador;
            this.Federacion = Federacion;
            this.Usuario = Usuario;
            this.Contrasena = Contrasena;
        }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

        public String getFederacion() {
            return Federacion;
        }

        public void setFederacion(String Federacion) {
            this.Federacion = Federacion;
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