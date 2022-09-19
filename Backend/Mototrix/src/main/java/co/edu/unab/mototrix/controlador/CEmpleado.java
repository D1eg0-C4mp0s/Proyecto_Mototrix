
package co.edu.unab.mototrix.controlador;

import co.edu.unab.mototrix.modelo.Empleado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CEmpleado {
    public static void registrarEmpleado(int idEmpleado, String nombre, String telefono, String tipo, double salario){
        
        try {
            Empleado e = new Empleado(idEmpleado, nombre, telefono, tipo, salario);
            Statement st = Conexion.getConect().createStatement();
            st.execute("insert into empleado values('"+e.getIdEmpleado()+"','"+e.getNombre()+"','"+e.getTelefono()+"','"+e.getTipo()+"','"+e.getSalario()+"')");
            JOptionPane.showMessageDialog(null, "Empleado registrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Empleado no registrado");
            
        }
    }
    
    public static ResultSet consultarTodosEmpleados(){
        
        ResultSet rs = null;
        
        
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from empleado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return rs;
    }
    
    public static ResultSet consultarEmpleado(int id){
        
        ResultSet rs = null;
        
        
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from empleado where idEmpleado = '"+id+"'");
            
        } catch (SQLException ex) {
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return rs;
    }
    
        public static void editarEmpleado(int idEmpleado, String nombre, String telefono, String tipo, double salario){
        
        try {
            Empleado e = new Empleado(idEmpleado, nombre, telefono, tipo, salario);
            Statement st = Conexion.getConect().createStatement();
            st.execute("update empleado set nombre = '"+nombre+"', telefono = '"+telefono+"', tipo = '"+tipo+"', salario = '"+salario+"'");
            JOptionPane.showMessageDialog(null, "Empleado Actualizado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Empleado no actualizado");
            
        }
    }
    
    public static void pintarTablaEmpleado(JTable tabla, ResultSet rs){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("TIPO");
        modelo.addColumn("SALARIO");
        
        try {
            while (rs.next()) {
                
                String[]fila = {rs.getString("idEmpleado"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("tipo"), rs.getString("salario")};
                modelo.addRow(fila);
            
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
    }
    
            
    public static void eliminarEmpleado(int idEmpleado){
        try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("delete from empleado where idEmpleado = '"+idEmpleado+"'");
            JOptionPane.showMessageDialog(null, "Empleado Eliminado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Empleado no eliminado");
            
        }
                    
    }
    
}
