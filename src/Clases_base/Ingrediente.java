/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_base;

import java.awt.Image;

public class Ingrediente {
    
    public String codigoIngrediente;
    private String nombre;
    private String beneficio;
    private int cantidad;
    private float precio;
    private Image foto;

    public Ingrediente() {
    }

    public Ingrediente(String codigoIngrediente, String nombre, String beneficio, int cantidad, float precio, Image foto) {
        this.codigoIngrediente = codigoIngrediente;
        this.nombre = nombre;
        this.beneficio = beneficio;
        this.cantidad = cantidad;
        this.precio = precio;
        this.foto = foto;
    }

    public Ingrediente(String codigoIngrediente, String nombre, String beneficio, int cantidad, float precio) {
        this.codigoIngrediente = codigoIngrediente;
        this.nombre = nombre;
        this.beneficio = beneficio;
        this.cantidad = cantidad;
        this.precio = precio;
    }

   
    
    
    /**
     * @return the codigoIngrediente
     */
    public String getCodigoIngrediente() {
        return codigoIngrediente;
    }

    /**
     * @param codigoIngrediente the codigoIngrediente to set
     */
    public void setCodigoIngrediente(String codigoIngrediente) {
        this.codigoIngrediente = codigoIngrediente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the beneficio
     */
    public String getBeneficio() {
        return beneficio;
    }

    /**
     * @param beneficio the beneficio to set
     */
    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }



    /**
     * @return the foto
     */
    public Image getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
}
