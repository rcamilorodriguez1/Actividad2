/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.LocalDateTime;

/**
 *
 * @author Jose Rodriguez
 */
public class Motocicleta extends Vehiculo{
    private String placa;
    private String marca;
    private int cilindraje;
    
    public Motocicleta(String placa, String marca, int cilindraje, LocalDateTime entrada, LocalDateTimeSalida){
        super(entrada,salida);
        
    }
}
