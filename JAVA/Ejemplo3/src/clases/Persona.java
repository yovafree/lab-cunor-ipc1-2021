/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Es una clase que representa a una persona
 * @author erwin
 */
public class Persona {
    String cui;
    private String primerNombre;
    private String segundoNombre;
    private String terceNombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    
    /**
     * Método para modificar el CUI
     * @param cui 
     */
    public void setCui(String cui){
        this.cui = cui;
    }
    
    /**
     * Método para obtener el CUI
     * @return 
     */
    public String getCui(){
        return this.cui;
    }

    /**
     * Método para obtener el primer nombre
     * @return the primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return the segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * @param segundoNombre the segundoNombre to set
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * @return the terceNombre
     */
    public String getTerceNombre() {
        return terceNombre;
    }

    /**
     * @param terceNombre the terceNombre to set
     */
    public void setTerceNombre(String terceNombre) {
        this.terceNombre = terceNombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
