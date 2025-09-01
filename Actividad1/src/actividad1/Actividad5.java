/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author Jose Rodriguez
 */
public class Actividad5 {
    public static double calcular_area_rectangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        double base = 5.0;
        double altura = 3.0;

        double area = calcular_area_rectangulo(base, altura);
        System.out.println("El área del rectángulo es: " + area);
    }
}
