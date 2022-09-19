
package co.edu.unab.mototrix.modelo;

public class Vehiculo {
    private int idVehiculos;
    private String marca; 
    private int kilometros_rec;
    private String estado;

    public Vehiculo(int idVehiculos, String marca, int kilometros_rec, String estado) {
        this.idVehiculos = idVehiculos;
        this.marca = marca;
        this.kilometros_rec = kilometros_rec;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(int idVehiculos) {
        this.idVehiculos = idVehiculos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometros_rec() {
        return kilometros_rec;
    }

    public void setKilometros_rec(int kilometros_rec) {
        this.kilometros_rec = kilometros_rec;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculos=" + idVehiculos + ", marca=" + marca + ", kilometros_rec=" + kilometros_rec + ", estado=" + estado + '}';
    }
    
    
}
