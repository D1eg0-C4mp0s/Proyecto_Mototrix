
package co.edu.unab.mototrix.modelo;

public class Servicios {
    private int idServicios;
    private String nombre_serv;
    private Short tiene_insumos;
    private Short tiene_refaciones;

    public Servicios(int idServicios, String nombre_serv, Short tiene_insumos, Short tiene_refaciones) {
        this.idServicios = idServicios;
        this.nombre_serv = nombre_serv;
        this.tiene_insumos = tiene_insumos;
        this.tiene_refaciones = tiene_refaciones;
    }

    public Short getTiene_refaciones() {
        return tiene_refaciones;
    }

    public void setTiene_refaciones(Short tiene_refaciones) {
        this.tiene_refaciones = tiene_refaciones;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombre_serv() {
        return nombre_serv;
    }

    public void setNombre_serv(String nombre_serv) {
        this.nombre_serv = nombre_serv;
    }

    public Short getTiene_insumos() {
        return tiene_insumos;
    }

    public void setTiene_insumos(Short tiene_insumos) {
        this.tiene_insumos = tiene_insumos;
    }

    @Override
    public String toString() {
        return "Servicios{" + "idServicios=" + idServicios + ", nombre_serv=" + nombre_serv + ", tiene_insumos=" + tiene_insumos + ", tiene_refaciones=" + tiene_refaciones + '}';
    }
    
}
