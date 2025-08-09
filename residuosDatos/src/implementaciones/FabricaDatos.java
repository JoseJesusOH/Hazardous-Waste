package implementaciones;

/**
 * Fabrica datos la cual nos proporciona instancia de diferentes clases.
 */
public class FabricaDatos {

    private static FDatos datos;

    /**
     * Método que devuelve la fachada de datos ya sea que si exista o no exista
     *
     * @return
     */
    public static FDatos crearFDatos() {
        if (datos != null) {
            return datos;
        } else {
            datos = new FDatos();
            return datos;
        }
    }

}
