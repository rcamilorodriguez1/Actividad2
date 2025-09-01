/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author Jose Rodriguez
 */
public class Actividad4 {
    public static void main(String[] args) {
        int numero = 7;
        int contador = 1;

        System.out.println("Primeros 5 múltiplos de " + numero + ":");
        while (contador <= 5) {
            System.out.println(numero * contador);
            contador++;
        }
    }
}
