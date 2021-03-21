/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

/**
 * Clase padre encargada de definir metodos y variables comunes
 * @author Alejandro Cuaran
 * @author David Parrado
 * @version 1.0.0
 * @since Netbeans IDE 12.2, JDK 1.8.0_281
 */
public abstract class Figura implements IFigura {
    /**
     * Variable que indica el area de la figura
     */
    private float area; 
    
    /**
     * * Variable que indica el perimetro de la figura
     */
    private float perimetro;
    
    /**
     * Metodo abstracto que calcula el area de una figura
     */
    public abstract void calcularArea(); 
    
    /**
     * Metodo abstracto que calcula el perimetro de una figura
     */
    public abstract void calcularPerimetro();

    
    /**
     * Metodo para obtener el valor de la variable area
     * @return retorna el valor de area
     */
    public float getArea() {
        return area;
    }

    /**
     * Metodo para establecer el valor de la variable area
     * @param area recibe como parametro el valor de area
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * Metodo para obtener el valor de la variable perimetro
     * @return retorna el valor del perimetro
     */
    public float getPerimetro() {
        return perimetro;
    }
    
    /**
     * Metodo para obtener el valor de la variable perimetro
     * @param perimetro recibe como parametro el valor del perimetro
     */
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
}
