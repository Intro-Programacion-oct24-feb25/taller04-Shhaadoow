/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Declaro variables
        String nombreHijo1;
        String nombreHijo2;
        String nombreHijo3;
        int gastosHijo1;
        int gastosHijo2;
        int gastosHijo3;
        int gastoTotal;
        
        System.out.println("Ingrese el nombre del primer hijo");
        nombreHijo1 = entrada.nextLine();
        System.out.println("Ingrese los gastos del primer hijo");
        gastosHijo1 = entrada.nextInt();
        System.out.println("Ingrese el nombre del segundo hijo");
        entrada.nextLine ();
        nombreHijo2 = entrada.nextLine ();
        System.out.println("Ingrese los gastos del segundo hijo");
        gastosHijo2 = entrada.nextInt ();
        System.out.println("Ingrese el nombre del tercer hijo");
        entrada.nextLine ();
        nombreHijo3 = entrada.nextLine ();
        System.out.println("Ingrese los gastos del tercer hijo");
        gastosHijo3 = entrada.nextInt ();
        
        gastoTotal = (gastosHijo1 + gastosHijo2 + gastosHijo3);
        
        System.out.printf("Nombre del primer hijo: %s\nGastos del primer hijo:"
                + "%s\nNombre del segundo hijo: %s\nGastos del segundo hijo:"
                + "%s\nNombre del tercer hijo: %s\nGastos del tercer hijo:"
                + "%s\nGastos totales de los hijos: %s\n", nombreHijo1, 
                gastosHijo1, nombreHijo2, gastosHijo2, nombreHijo3, gastosHijo3,
                gastoTotal);
        
    }
    
}
