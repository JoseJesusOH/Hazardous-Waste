package interfaces;

import com.mongodb.client.MongoDatabase;
/**
 * Interfaz de la conexion.
 */
public interface IConexionBD {

    /**
     * Interface de conexion para la base de datos
     *
     * @return
     */
    MongoDatabase crearConexion();
}
