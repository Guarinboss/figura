/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {

    public Principal() {
        iniciar();
    }
    
    public void iniciar() {
        Scanner valor = new Scanner(System.in);
        
        float ladoTriangulo1, ladoTriangulo2, ladoTriangulo3;
        float ladoRectangulo1, ladoRectangulo2;
        float radioCirculo, ladoCuadrado;
        
        System.out.println("Ingrese los lados para el Triangulo.");
        System.out.println("Lado 1; ");
        ladoTriangulo1 = valor.nextByte();
        System.out.println("Lado 2; ");
        ladoTriangulo2 = valor.nextByte();
        System.out.println("Lado 3; ");
        ladoTriangulo3 = valor.nextByte();
        
        System.out.println("Ingrese los lados para el Rectangulo.");
        System.out.println("Lado 1; ");
        ladoRectangulo1 = valor.nextByte();
        System.out.println("Lado 2; ");
        ladoRectangulo2 = valor.nextByte();
        
        System.out.println("Ingrese el radio para el Circulo.");
        System.out.println("Radio; ");
        radioCirculo = valor.nextByte();
        
        System.out.println("Ingrese el lado para el Cuadrado.");
        System.out.println("Lado; ");
        ladoCuadrado = valor.nextByte();
        
        IFigura triangulo = new Triangulo(ladoTriangulo1, ladoTriangulo2, ladoTriangulo3);
        IFigura rectangulo = new Rectangulo(ladoRectangulo1, ladoRectangulo2);
        IFigura circulo = new Circulo(radioCirculo);
        IFigura cuadrado = new Cuadrado(ladoCuadrado);
        
        IFigura[] vector = new IFigura[4];
        vector[0] = triangulo;
        vector[1] = rectangulo;
        vector[2] = circulo;
        vector[3] = cuadrado;
        
        for(IFigura fig : vector) {
            Figura figur;
            figur = ((Figura) fig);
            figur.calcularArea();
            figur.calcularPerimetro();
            fig.imprimirDatos();
        }
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    
    
}
