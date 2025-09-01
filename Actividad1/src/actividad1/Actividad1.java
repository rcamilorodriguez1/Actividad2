/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1;

/**
 *
 * @author Jose Rodriguez
 */
import java.util.Scanner;

public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su salario mensual: ");
        double salarioMensual = sc.nextDouble();

        
        double salarioAnual = salarioMensual * 12;
        int edadDoble = edad * 2;

       
        System.out.println("Hola " + nombre);
        System.out.println("Tu salario anual es: " + salarioAnual);
        System.out.println("El doble de tu edad es: " + edadDoble);
      
    }
    
}
