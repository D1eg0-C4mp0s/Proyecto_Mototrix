
package co.edu.unab.mototrix.controlador;


import co.edu.unab.mototrix.modelo.Vehiculo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CVehiculo {
    public static void registrarVehiculo(int idVehiculos, String marca, int kilometros_rec, String estado){
        
        try {
            Vehiculo e = new Vehiculo(idVehiculos, marca, kilometros_rec, estado);
            Statement st = Conexion.getConect().createStatement();
            st.execute("insert into vehiculo values('"+e.getIdVehiculos()+"','"+e.getMarca()+"','"+e.getKilometros_rec()+"','"+e.getEstado()+"')");
            JOptionPane.showMessageDialog(null, "Vehiculo registrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Vehiculo no registrado");
            
        }
    }
    
    public static ResultSet consultarTodosVehiculos(){
        
        ResultSet rs = null;
        
        
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from vehiculo");
            
        } catch (SQLException ex) {
            Logger.getLogger(CVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return rs;
    }
    
    public static ResultSet consultarVehiculo(int id){
        
        ResultSet rs = null;
        
        
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from vehiculo where idVehiculo = '"+id+"'");
            
        } catch (SQLException ex) {
            Logger.getLogger(CVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return rs;
    }
    
        public static void editarVehiculo(int idVehiculos, String marca, int kilometros_rec, String estado){
        
        try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("update vehiculo set marca = '"+marca+"', kilometros_rec = '"+kilometros_rec+"', estados = '"+estado+"' where idVehiculo = '"+idVehiculos+"' ");
            JOptionPane.showMessageDialog(null, "Vehiculo Actualizado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Vehiculo no actualizado");
            
        }
    }
    
    public static void pintarTablaVehiculo(JTable tabla, ResultSet rs){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("MARCA");
        modelo.addColumn("KILOMETRAJE");
        modelo.addColumn("ESTADO");
        
        try {
            while (rs.next()) {
                
                String[]fila = {rs.getString("idVehiculos"), rs.getString("marca"), rs.getString("kilometros_rec"), rs.getString("estado")};
                modelo.addRow(fila);
            
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(CVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
    }
    
            
    public static void eliminarVehiculo(int idVehiculo ){
        try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("delete from vehiculo where idVehiculo = '"+idVehiculo+"'");
            JOptionPane.showMessageDialog(null, "Vehiculo Eliminado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Vehiculo no eliminado");
            
        }
                    
    }
}
