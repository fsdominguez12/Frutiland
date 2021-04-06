
package Clases_base;

public class Ensalada {
    
    private String codigoEnsalada;
    private String cedulaCliEnsa;
    private String descripcion;
    private double precio;
    private float tiempoEspera;
    private String estado;

    public Ensalada() {
    }

    public Ensalada(String codigoEnsalada, String cedulaCliEnsa, String descripcion, double precio, float tiempoEspera, String estado) {
        this.codigoEnsalada = codigoEnsalada;
        this.cedulaCliEnsa = cedulaCliEnsa;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tiempoEspera = tiempoEspera;
        this.estado = estado;
    }

    public String getCodigoEnsalada() {
        return codigoEnsalada;
    }

    public void setCodigoEnsalada(String codigoEnsalada) {
        this.codigoEnsalada = codigoEnsalada;
    }

    public String getCedulaCliEnsa() {
        return cedulaCliEnsa;
    }

    public void setCedulaCliEnsa(String cedulaCliEnsa) {
        this.cedulaCliEnsa = cedulaCliEnsa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(float tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
