/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

/**
 * Clase hija de la Clase Figura encargada de recibir los lados de la figura
 * Rectangulo para calcular el area y perímetro, y a su vez imprimir los 
 * calculos realizados.
 *
 * @author Alejandro Cuaran
 * @author David Parrado
 * @version 1.0.0
 * @since Netbeans IDE 12.2, JDK 1.8.0_281
 */
public class Rectangulo extends Figura {

    /**
     * Variable que indica el primer lado para el Rectangulo.
     */
    private float lado1;
    
    /**
     * Variable que indica el segundo lado para el Rectangulo.
     */
    private float lado2;

    /**
     * Constructor sobrecargado de la clase Rectángulo que recibe los lados
     * ingresados en la clase Figura.
     * 
     * @param lado1 recibe como parámetro el valor del lado 1 para el 
     * Rectángulo.
     * 
     * @param lado2 recibe como parámetro el valor del lado 2 para el 
     * Rectángulo.
     */
    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    /**
     * Método abstracto que calcula el area para el Rectángulo.
     */
    @Override
    public void calcularArea() {
        super.setArea((float)(lado1*lado2));
    }

    /**
     * Método abstracto que calcula el perímetro para el Rectángulo.
     */
    @Override
    public void calcularPerimetro() {
        super.setPerimetro((float)(2*(lado1+lado2)));
    }
    
    /**
     * Método abstracto que imprime el area y perímetro del Rectángulo.
     */
    @Override
    public void imprimirDatos() {
        System.out.println("El area del Rectangulo es igual a: " + super.getArea() + "\n" + 
                "y el perimetro del Rectangulo es igual a: " + super.getPerimetro() + "\n");
    }

    /**
     * Método que retorna el valor del lado 1 del Rectángulo.
     * 
     * @return retorna el valor del lado 1 del Rectángulo.
     */
    public float getLado1() {
        return lado1;
    }

    /**
     * Método que recibe el lado 1 del Rectángulo ingresado en la clase Figura.
     * 
     * @param lado1 recibe como parámetro el lado 1 del Rectángulo.
     */
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    /**
     * Método que retorna el valor del lado 2 del Rectángulo.
     * 
     * @return retorna el valor del lado 2 del Rectángulo.
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * Método que recibe el lado 2 del Rectángulo ingresado en la clase Figura.
     * 
     * @param lado2 recibe como parámetro el lado 2 del Rectángulo.
     */
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
}
