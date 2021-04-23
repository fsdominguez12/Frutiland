
package Clases_base;

public class Ensalada {
    
    private String codigoEnsalada;
    private String cedulaCliEnsa;
    private String descripcion;
    private float precio;
    private int tiempoEspera;
    private boolean estado;
    private String horaGeneracion;
    private String horaEntrega;

    public Ensalada() {
    }

    public Ensalada(String codigoEnsalada, String cedulaCliEnsa, String descripcion, float precio, int tiempoEspera, boolean estado, String horaGeneracion, String horaEntrega) {
        this.codigoEnsalada = codigoEnsalada;
        this.cedulaCliEnsa = cedulaCliEnsa;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tiempoEspera = tiempoEspera;
        this.estado = estado;
        this.horaGeneracion = horaGeneracion;
        this.horaEntrega = horaEntrega;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getHoraGeneracion() {
        return horaGeneracion;
    }

    public void setHoraGeneracion(String horaGeneracion) {
        this.horaGeneracion = horaGeneracion;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    
}
