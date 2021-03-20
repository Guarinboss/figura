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
public class Circulo extends Figura {

    private float radio;

    public Circulo(float radio, float area, float perimetro) {
        super(area, perimetro);
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        super.setArea((float) (Math.PI * Math.pow(radio, 2)));
    }

    @Override
    public void calcularPerimetro() {
        super.setPerimetro((float) (2 * Math.PI * radio));
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
