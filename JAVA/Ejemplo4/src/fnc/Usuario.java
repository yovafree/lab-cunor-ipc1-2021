/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnc;

/**
 *
 * @author erwin
 */
public class Usuario {
    private String nombres;
    private String apellidos;
    private String direccion;
    private String dpi;
    
    public Usuario(){
        this.nombres = "";
        this.apellidos = "";
        this.direccion = "";
        this.dpi = "";
    }
    
    public Usuario(String nombres, String apellidos, String direccion, String dpi){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dpi = dpi;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    /**
     * @return the dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    
    
}
