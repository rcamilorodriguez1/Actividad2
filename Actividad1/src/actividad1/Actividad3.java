/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author Jose Rodriguez
 */
public class Actividad3 {
    public static void main(String[] args) {
        int numero = 50;
        int contador = 0;

        System.out.println("Divisores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Cantidad de divisores: " + contador);
    }
}
