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
public class Triangulo extends Figura{

    private float lado1;
    
    private float lado2;
    
    private float lado3;

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public void calcularArea() {
        if (lado1 == lado2 & lado1 == lado3 & lado2 == lado3){
            super.setArea((float)((Math.sqrt(3)/4)*Math.pow(lado1, 2)));
        }
        else if(lado1 != lado2 & lado1 != lado3 & lado2 != lado3){
            float semiperimetro = (lado1+lado2+lado3)/2;
            super.setArea((float)(Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3))));
        }else{
            if(lado1 == lado2){
                super.setArea((float)((lado3*Math.sqrt(Math.pow(lado1, 2)-(Math.pow(lado3, 2)/4)))/2));
            }
            else if(lado1 == lado3){
                super.setArea((float)((lado2*Math.sqrt(Math.pow(lado1, 2)-(Math.pow(lado2, 2)/4)))/2));
            }
            else{
                super.setArea((float)((lado1*Math.sqrt(Math.pow(lado2, 2)-(Math.pow(lado1, 2)/4)))/2));
            }
        }
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(lado1+lado2+lado3);
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

    /**
     * @return the lado3
     */
    public float getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
}
