/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

/**
 * Clase hija de la clase Figura ecargada de recibir el radio de la figura 
 * Circulo para calcular el area y perímetro, y a su vez imprimir los 
 * calculo realizados. 
 * 
 * @author Alejandro Cuaran
 * @author David Parrado
 * @version 1.0.0
 * @since Netbeans IDE 12.2, JDK 1.8.0_281
 */
public class Circulo extends Figura {

    /**
     * Variable que indica el radio para el Circulo.
     */
    private float radio;

    /**
     * Constructor sobrecargado de la clase Circulo que recibe el radio
     * ingresado en la clase Figura.
     * 
     * @param radio recibe como parametro el valor del radio para el
     * Circulo.
     */
    public Circulo(float radio) {
        this.radio = radio;
    }
    
    /**
     * Método abstracto que calcula el area para el Circulo.
     */
    @Override
    public void calcularArea() {
        super.setArea((float) (Math.PI * Math.pow(radio, 2)));
    }
    
    /**
     * Método abstracto que calcula el perimetro para el Círculo.
     */
    @Override
    public void calcularPerimetro() {
        super.setPerimetro((float) (2 * Math.PI * radio));
    }
    
    /**
     * Método abstracto que imprime el area y perímetro del Círculo.
     */
    @Override
    public void imprimirDatos() {
        System.out.println("El area del Circulo es igual a: " + super.getArea() + "\n" + 
                "y el perimetro del Circulo es igual a: " + super.getPerimetro() + "\n");
    }

    /**
     * Método que retorna el valor del radio del Círculo.
     * 
     * @return retorna el valor del radio del Círculo.
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Método que recibe el radio del Círculo ingresado en la clase Fígura.
     * 
     * @param radio recibe como parámetro el radio del Círculo.
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
