/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_base;

/**
 *
 * @author Jonnathan
 */
public class Ensalada {
    
    private String codigoEnsalada;
    private String descripcion;
    private double precio;
    private String tiempo_espera;
    private String estado;

    public Ensalada() {
    }

    public Ensalada(String codigoEnsalada, String descripcion, double precio, String tiempo_espera, String estado) {
        this.codigoEnsalada = codigoEnsalada;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tiempo_espera = tiempo_espera;
        this.estado = estado;
    }

    /**
     * @return the codigoEnsalada
     */
    public String getCodigoEnsalada() {
        return codigoEnsalada;
    }

    /**
     * @param codigoEnsalada the codigoEnsalada to set
     */
    public void setCodigoEnsalada(String codigoEnsalada) {
        this.codigoEnsalada = codigoEnsalada;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the tiempo_espera
     */
    public String getTiempo_espera() {
        return tiempo_espera;
    }

    /**
     * @param tiempo_espera the tiempo_espera to set
     */
    public void setTiempo_espera(String tiempo_espera) {
        this.tiempo_espera = tiempo_espera;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
