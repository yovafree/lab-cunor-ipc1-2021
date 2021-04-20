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
public class Triangulo extends FiguraGeometrica {
    private int angulo1;
    private int angulo2;
    private int angulo3;
    
    
    public Triangulo(){
        this.altura = 5;
        this.base = 4;
        this.noLados = 3;
        this.nombre = "Triangulo";
        this.angulo1 = 35;
        this.angulo2 = 45;
        this.angulo3 = 10;
    }
    
    public Triangulo(int noLados, int base, int altura, String nombre) {
        super(noLados, base, altura, nombre);
    }

    
    @Override
    public void MostrarInfo(){
        System.out.println("Nombre:" + nombre);
        System.out.println("No lados:" + noLados);
        System.out.println("Base:" + base);
        System.out.println("Altura:" + altura);
        System.out.println("Angulo 1:" + angulo1);
        System.out.println("Angulo 2:" + angulo2);
        System.out.println("Angulo 3:" + angulo3);
    }
    
    /**
     * @return the angulo1
     */
    public int getAngulo1() {
        return angulo1;
    }

    /**
     * @param angulo1 the angulo1 to set
     */
    public void setAngulo1(int angulo1) {
        this.angulo1 = angulo1;
    }

    /**
     * @return the angulo2
     */
    public int getAngulo2() {
        return angulo2;
    }

    /**
     * @param angulo2 the angulo2 to set
     */
    public void setAngulo2(int angulo2) {
        this.angulo2 = angulo2;
    }

    /**
     * @return the angulo3
     */
    public int getAngulo3() {
        return angulo3;
    }

    /**
     * @param angulo3 the angulo3 to set
     */
    public void setAngulo3(int angulo3) {
        this.angulo3 = angulo3;
    }
    
    
    
}
