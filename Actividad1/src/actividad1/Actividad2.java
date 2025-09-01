/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author Jose Rodriguez
 */
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número (1-7) para representar el día: ");
        int dia = sc.nextInt();

        if (dia >= 1 && dia <= 5) {
            System.out.println("Es un día laboral");
        } else if (dia == 6 || dia == 7) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("Error: número fuera de rango");
        }
    }
}
