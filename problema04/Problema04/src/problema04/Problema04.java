/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingresamos dstos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        // Declaramos variables
        String nombresCompletos;
        int cpu;
        int teclado;
        int raton;
        int pantalla;
        int valorTotal;
        
        System.out.println("Ingrese su nombre completo por favor");
        nombresCompletos = entrada.nextLine ();
        System.out.println("Ingrese el valor a pagar por el CPU");
        cpu = entrada.nextInt ();
        System.out.println("Ingrese el valor a pagar por el teclado");
        teclado = entrada.nextInt ();
        System.out.print("Ingrese el valor a pagar por el ratón");
        raton = entrada.nextInt ();
        System.out.println("Ingrese el valor a pagar por la pantalla");
        pantalla = entrada.nextInt ();
        
        valorTotal = (cpu + teclado + raton + pantalla);
        
        System.out.printf("Reporte:\nNombres completos: %s\nCPU: %s\nTeclado: "
                + "%s\n"
                + "Ratón: %s\nPantalla: %s\n\nValor total a cancelar: %s\n",
                nombresCompletos, cpu, teclado, raton, pantalla, valorTotal);
    }
    
}
