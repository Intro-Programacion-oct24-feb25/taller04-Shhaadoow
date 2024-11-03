/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // Declaro variables
        double baseTriangulo;
        double alturaTriangulo;
        double areaTotal;
        
        System.out.println("Ingrese la base del triángulo");
        baseTriangulo = entrada.nextDouble ();
        System.out.println("Ingrese la altura del triángulo");
        alturaTriangulo = entrada.nextDouble ();
        
        areaTotal = (baseTriangulo + alturaTriangulo) / 2;
        
        System.out.printf("Base triangulo: %s\nAltura triangulo: %s\nArea total"
                + ":%.2f\n",baseTriangulo, alturaTriangulo, areaTotal);  
    }
    
}
