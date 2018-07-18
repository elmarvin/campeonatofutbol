package Logica;
import Datos.DatConexion;
import java.sql.SQLException;

public class ManConexion 
{
    //para poder acceder a paquete DAT
    DatConexion ManejadorConexion = new DatConexion();
    public void CerrarConexion() throws SQLException
    {
        ManejadorConexion.CerrarConexion();
    }
}