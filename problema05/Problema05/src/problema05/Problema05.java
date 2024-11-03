/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Declaramos variables
        double netflix;
        double youtubePremium;
        double spotify;
        double dropbox;
        double descuento1;
        double precioFinal;
        double descuento2;
        double precioFinal1;
        double descuento3;
        double precioFinal2;
        double valorTotal;
        
        System.out.println("Se le "
                + "aplicará un descuento"
                + "del 23% a lo "
                + "siguiente \nIngrese el valor a pagar por Netflix:");
        netflix = entrada.nextDouble ();
        System.out.println("Se le "
                + "aplicará un "
                + "descuento del "
                + "23% a lo "
                + "siguiente \nIngrese el valor a pagar por YouTube premium");
        youtubePremium = entrada.nextDouble ();
        System.out.println("Ingrese el valor a pagar por Spotify");
        spotify = entrada.nextDouble ();
        System.out.println("Se le "
                + "aplicará un descuento "
                + "del 45% a lo "
                + "siguiente \nIngrese el valor a pagar por Dropbox");
        dropbox = entrada.nextDouble ();
        
        descuento1 = (netflix * 0.23);
        precioFinal = (netflix - descuento1);
        
        descuento2 = (youtubePremium * 0.23);
        precioFinal1 = (youtubePremium - descuento2);
        
        descuento3 = (dropbox * 0.45);
        precioFinal2 = (dropbox - descuento3);
        
        valorTotal = (precioFinal + precioFinal1 + spotify + precioFinal2);
        
        System.out.printf("Valor Netflix: %.2f\nValor YouTube Premium: %.2f\n"
                + "Valor Spotify: %.2f\nValor Dropbox: "
                + "%.2f\nValor total a pagar:"
                + "%.2f\n", precioFinal, precioFinal1, spotify, precioFinal2,
                valorTotal);
        
        
    }
    
}
