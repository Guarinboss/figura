/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

/**
 * Clase hija de la Clase Figura encargada de recibir los lados de la figura
 * Triangulo para calcular el area y perímetro, y a su vez imprimir 
 * los calculos realizados.
 *
 * @author Alejandro Cuaran
 * @author David Parrado
 * @version 1.0.0
 * @since Netbeans IDE 12.2, JDK 1.8.0_281
 */
public class Triangulo extends Figura{

    /**
     * Variable que indica el primer lado para el Triángulo.
     */
    private float lado1;
    
    /**
     * Variable que indica el segundo lado para el Triángulo.
     */
    private float lado2;
    
    /**
     * Variable que indica el tercer lado para el Triángulo.
     */
    private float lado3;

    /**
     * Constructor sobrecargado de la clase Triángulo que recibe los lados
     * ingresados en la clase Figura.
     * 
     * @param lado1 recibe como parámetro el lado 1 del Triángulo.
     * @param lado2 recibe como parámetro el lado 2 del Triángulo.
     * @param lado3 recibe como parámetro el lado 3 del Triángulo.
     */
    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    /**
     * Método abstracto que calcula el area para el Triángulo.
     */
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

    /**
     * Método abstracto que calcula el perímetro para el Triángulo.
     */
    @Override
    public void calcularPerimetro() {
        setPerimetro(lado1+lado2+lado3);
    }
    
    /**
     * Método abstracto que imprime el area y perímetro del Triángulo.
     */
    @Override
    public void imprimirDatos() {
        System.out.println("El area del Triangulo es igual a: " + super.getArea() + "\n" + 
                "y el perimetro del Triangulo es igual a: " + super.getPerimetro() + "\n");
    }

    /**
     * Método que retorna el valor del lado 1 del Triángulo.
     * 
     * @return retorna el valor del lado 1 del Triángulo.
     */
    public float getLado1() {
        return lado1;
    }

    /**
     * Método que recibe el lado 1 del Triángulo ingresado en la clase Figura.
     * 
     * @param lado1 recibe como parámetro el lado 1 del Triángulo.
     */
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    /**
     * Método que retorna el valor del lado 2 del Triángulo.
     * 
     * @return retorna el valor del lado 2 del Triángulo.
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * Método que recibe el lado 2 del Triángulo ingresado en la clase Figura.
     * 
     * @param lado2 recibe como parámetro el lado 2 del Triángulo.
     */
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    /**
     * Método que retorna el valor del lado 3 del Triángulo.
     * 
     * @return retorna el valor del lado 3 del Triángulo.
     */
    public float getLado3() {
        return lado3;
    }

    /**
     * Método que recibe el lado 3 del Triángulo ingresado en la clase Figura.
     * 
     * @param lado3 recibe como parámetro el lado 3 del Triángulo.
     */
    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
}
