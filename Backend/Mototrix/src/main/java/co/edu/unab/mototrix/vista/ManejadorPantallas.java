
package co.edu.unab.mototrix.vista;

public class ManejadorPantallas {
    private static Dashboard pantallaPrincipal; 
    
    public static void abrirPantallaPrincipal(){
        pantallaPrincipal = new Dashboard();
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }
    
    public static void cerrarPantallaPrincipal(){
        pantallaPrincipal.setVisible(false);
        pantallaPrincipal = null;
        
    }
}
