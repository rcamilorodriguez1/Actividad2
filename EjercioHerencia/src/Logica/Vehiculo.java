/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Jose Rodriguez
 */
import java.time.Duration;
import java.time.LocalDateTime;
public abstract class Vehiculo {
    protected LocalDateTime horaEntrada;
    protected LocalDateTime horaSalida;
    
    public Vehiculo(LocalDateTime entrada, LocalDateTime salida){
        this.horaEntrada=entrada;
        this.horaSalida=salida;
    }
    
    public LocalDateTime getHoraEntrada(){
        return horaEntrada;
    }
    public void setHoraEntrada(LocalDateTime entrada){
        this.horaEntrada=entrada;
    }
     public LocalDateTime getHoraSalida(){
        return horaSalida;
    }
    public void setHoraSalida(LocalDateTime salida){
        this.horaSalida=salida;
    }
    
    public long getHorasParqueo(){
        return Duration.between(horaEntrada, horaSalida).toHours();
    }
    public abstract double calcularCosto();
   
}
