/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figuras;

import java.util.Scanner;

/**
 * Clase encargada de recibir los datos para las figuras Circulo, Cuadrado, 
 * Triángulo y Rectángulo, almacenar los datos en un objeto que corresponda a
 * la figura y guardarlas en un vector, con el objetivo de hacer llamado a 
 * metodos abstractos que calculan e imprimen el area y perímetro de cada 
 * una de estas.
 *
 * @author Alejandro Cuaran
 * @author David Parrado
 * @version 1.0.0
 * @since Netbeans IDE 12.2, JDK 1.8.0_281
 */
public class Principal {

    /**
     * Constructor de la clase, el cual inicializa o hace llamado al metodo
     * que realiza la funcion de la clase Figura.
     */
    public Principal() {
        iniciar();
    }
    
    /**
     * Método que recibe los datos de cada figura, almacena cada dato en su
     * correspondiente objeto y guardar dichos objetos en un vector, para luego
     * hacer llamado de métodos abstractos que calculen e impriman el area y 
     * perímetro de cada figura.
     */
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
    
    /**
     * Metodo que ejecuta un objeto de la clase Principal
     * @param args 
     */
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    
}
