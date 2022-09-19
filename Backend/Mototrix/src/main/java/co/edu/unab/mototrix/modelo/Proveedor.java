
package co.edu.unab.mototrix.modelo;

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String correo;
    private String telefono;

    public Proveedor(int idProveedor, String nombre, String correo, String telefono) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
}
