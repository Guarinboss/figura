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
public class Cuadrado extends Figura {
    
    private float lado;

    public Cuadrado(float lado, float area, float perimetro) {
        super(area, perimetro);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        super.setArea((float) Math.pow(lado, 2));
    }

    @Override
    public void calcularPerimetro() {
        super.setPerimetro((float) 4 * lado);
    }

    /**
     * @return the radio
     */
    public float getLado() {
        return lado;
    }

    /**
     * @param lado the radio to set
     */
    public void setLado(float lado) {
        this.lado = lado;
    }
    
}
