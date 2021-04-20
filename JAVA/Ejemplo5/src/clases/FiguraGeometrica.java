/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author erwin
 */
public class FiguraGeometrica {
    int noLados;
    int base;
    int altura;
    String nombre;
    
    public FiguraGeometrica(){
    
    }
    
    public FiguraGeometrica(int noLados, int base, int altura, String nombre){
        this.noLados = noLados;
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }
    
    public void MostrarInfo(){
        System.out.println("No lados:" + noLados);
        System.out.println("Base:" + base);
        System.out.println("Altura:" + altura);
        System.out.println("Nombre:" + nombre);
    }

    /**
     * @return the noLados
     */
    public int getNoLados() {
        return noLados;
    }

    /**
     * @param noLados the noLados to set
     */
    public void setNoLados(int noLados) {
        this.noLados = noLados;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
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
    
    
}
