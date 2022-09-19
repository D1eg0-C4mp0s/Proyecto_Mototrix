
package co.edu.unab.mototrix;

import co.edu.unab.mototrix.controlador.Conexion;
import co.edu.unab.mototrix.vista.ManejadorPantallas;

public class Mototrix {

    public static void main(String[] args) {
        Conexion.conectar();
        ManejadorPantallas.abrirPantallaPrincipal();
    }
}
