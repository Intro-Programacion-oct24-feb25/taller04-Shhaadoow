/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Declaro variables
        String nombresCompletos;
        String direccion;
        double costoMinutos;
        double minutosConsumidos;
        double valorTotal;
        
        System.out.println("Ingrese sus nombres completos por favor");
        nombresCompletos = entrada.nextLine ();
        System.out.println("Ingrese su dirección");
        direccion = entrada.nextLine ();
        System.out.println("Ingrese el costo por minutos");
        costoMinutos = entrada.nextDouble ();
        System.out.println("Ingrese los minutos consumidos por favor");
        minutosConsumidos = entrada.nextDouble ();
        
        valorTotal = (minutosConsumidos * costoMinutos);
        
        System.out.printf("Reporte: \nNombres completos: %s\n\tDirección: "
                + "%s\nCosto por "
                + "minutos: %.2f\n\tMinutos consumidos: %.2f\n\t\tValor total:"
                + "%.2f\n\t\t", nombresCompletos, direccion, costoMinutos,
                minutosConsumidos, valorTotal);
    }
    
}
