/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author Jose Rodriguez
 */
public class Actividad6 {
        public static void main(String[] args) {
        double[][] calificaciones = {
                {4.0, 3.5, 5.0}, 
                {3.0, 4.2, 4.5}, 
                {4.5, 3.8, 4.0} 
        };

        for (int est = 0; est < 3; est++) {
            double suma = 0;
            for (int asig = 0; asig < 3; asig++) {
                suma += calificaciones[asig][est];
            }
            System.out.println("Promedio estudiante " + (est + 1) + ": " + (suma / 3));
        }

        for (int asig = 0; asig < 3; asig++) {
            double suma = 0;
            for (int est = 0; est < 3; est++) {
                suma += calificaciones[asig][est];
            }
            System.out.println("Promedio asignatura " + (asig + 1) + ": " + (suma / 3));
        }
    }
}
