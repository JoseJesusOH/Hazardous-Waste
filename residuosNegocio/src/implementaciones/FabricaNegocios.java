package implementaciones;

public class FabricaNegocios {

    private static FNegocio negocios;

    /**
     * Método que devuelve la fachada de Negocio ya sea que si exista o no exista
     * @return 
     */
    public static FNegocio crearFNegocio() {
        if (negocios != null) {
            return negocios;
        } else {
             negocios= new FNegocio();
            return negocios;
        }
    }

}
