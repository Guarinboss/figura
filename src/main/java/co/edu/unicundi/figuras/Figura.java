/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

/**
 * Clase padre encargada de definir metodos y variables comunes para sus clases
 * hija.
 * 
 * @author Alejandro Cuaran
 * @author David Parrado
 * @version 1.0.0
 * @since Netbeans IDE 12.2, JDK 1.8.0_281
 */
public abstract class Figura implements IFigura {
    
    /**
     * Variable que indica el area de la figura.
     */
    private float area; 
    
    /**
     * Variable que indica el perímetro de la figura.
     */
    private float perimetro;
    
    /**
     * Método abstracto que calcula el area de una figura.
     */
    public abstract void calcularArea(); 
    
    /**
     * Método abstracto que calcula el perímetro de una figura.
     */
    public abstract void calcularPerimetro();

    /**
     * Método que retorna el valor del area de la figura.
     * 
     * @return retorna el valor de area de la figura.
     */
    public float getArea() {
        return area;
    }

    /**
     * Método que recibe el area de la figura.
     * 
     * @param area recibe como parámetro el area de la figura.
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * Método que retorna el valor del perímetro de la figura.
     * 
     * @return retorna el valor del perimetro de la figura.
     */
    public float getPerimetro() {
        return perimetro;
    }
    
    /**
     * Método que recibe el perímetro de la figura.
     * 
     * @param perimetro recibe como parametro el perímetro de la figura.
     */
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
}
