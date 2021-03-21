/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

/**
 *
 * @author User
 */
public class Rectangulo extends Figura {

    private float lado1;
    
    private float lado2;

    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public void calcularArea() {
        super.setArea((float)(lado1*lado2));
    }

    @Override
    public void calcularPerimetro() {
        super.setPerimetro((float)(2*(lado1+lado2)));
    }
    
    @Override
    public void imprimirDatos() {
        System.out.println("El area del Cuadrado es igual a: " + super.getArea() + "\n" + 
                "y el perimetro del Cuadrado es igual a: " + super.getPerimetro());
    }

    /**
     * @return the lado1
     */
    public float getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
}
