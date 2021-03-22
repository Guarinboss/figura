/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

/**
 * Clase hija de la clase Figura ecargada de recibir el lado de la figura 
 * Cuadrado para calcular el area y perímetro, y a su vez imprimir los 
 * calculo realizados. 
 * 
 * @author Alejandro Cuaran
 * @author David Parrado
 * @version 1.0.0
 * @since Netbeans IDE 12.2, JDK 1.8.0_281
 */
public class Cuadrado extends Figura {
    
    /**
     * Variable que indica el lado para el Cuadrado.
     */
    private float lado;

    /**
     * Constructor sobrecargado de la clase Circulo que recibe los datos
     * ingresados en la clase Figura.
     * 
     * @param lado recibe como parametro el valor del lado para el
     * Cuadrado.
     */
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    /**
     * Método abstracto que calcula el area para el Cuadrado.
     */
    @Override
    public void calcularArea() {
        super.setArea((float) Math.pow(lado, 2));
    }
    
    /**
     * Método que calcula el perimetro para el Cuadrado.
     */
    @Override
    public void calcularPerimetro() {
        super.setPerimetro((float) 4 * lado);
    }
    
    /**
     * Método abstracto que imprime el area y perímetro del Rectángulo.
     */
    @Override
    public void imprimirDatos() {
        System.out.println("El area del Cuadrado es igual a: " + super.getArea() + "\n" + 
                "y el perimetro del Cuadrado es igual a: " + super.getPerimetro() + "\n");
    }

    /**
     * Método que retorna el valor del lado del Cuadrado.
     * 
     * @return retorna el valor del lado del Cuadrado.
     */
    public float getLado() {
        return lado;
    }

    /**
     * Método que recibe el lado del Cuadrado ingresado en la clase Figura.
     * 
     * @param lado recibe como parámetro el lado del Cuadrado.
     */
    public void setLado(float lado) {
        this.lado = lado;
    }
    
}
