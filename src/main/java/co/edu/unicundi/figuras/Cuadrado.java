/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

/**
 * Clase hija de la clase Figura ecargada de recibir el lado de la figura 
 * Cuadrado para calcular el area y perimetro, y a su vez imprimir 
 * los calculo realizados. 
 * @author Alejandro Cuaran
 * @author David Parrado
 * @version 1.0.0
 * @since Netbeans IDE 12.2, JDK 1.8.0_281
 */
public class Cuadrado extends Figura {
    
    /**
     * Variable que indica el lado del Cuadrado
     */
    private float lado;

    /**
     * Constructor sobrecargado de la clase Circulo
     * @param lado recibe como parametro el valor del lado
     */
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    /**
     * Metodo que calcula el valor del area para un cuadrado
     */
    @Override
    public void calcularArea() {
        super.setArea((float) Math.pow(lado, 2));
    }
    
    /**
     * Metodo que calcula el valor del perimetro para un circulo
     */
    @Override
    public void calcularPerimetro() {
        super.setPerimetro((float) 4 * lado);
    }
    
    /**
     * Metodo que imprime los datos del circulo
     */
    @Override
    public void imprimirDatos() {
        System.out.println("El area del Cuadrado es igual a: " + super.getArea() + "\n" + 
                "y el perimetro del Cuadrado es igual a: " + super.getPerimetro() + "\n");
    }

    /**
     * Metodo que retorna el valor la variable lado
     * @return retorna el valor del lado
     */
    public float getLado() {
        return lado;
    }

    /**
     * Metodo que recibe como parametro el valor de la variable lado
     * @param lado recibe el valor del lado
     */
    public void setLado(float lado) {
        this.lado = lado;
    }
    
}
