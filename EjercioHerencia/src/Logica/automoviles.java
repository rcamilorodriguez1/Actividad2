/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Jose Rodriguez
 */
import java.time.LocalDateTime;

public class automoviles extends Vehiculo{
    private String placa;
    private String marca;
    private String modelo;
    private int NumPuertas;
    
    
    public automoviles(String placa, String marca, String modelo, int NumPuertas, LocalDateTime entrada, LocalDateTime salida){
        super(entrada,salida);
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.NumPuertas=NumPuertas;
        
    }
    
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public int getNumPuertas(){
        return NumPuertas;
    }
    public void setNumPuertas(int NumPuertas){
        this.NumPuertas=NumPuertas;
    }
    
    @Override
    public double calcularCosto(){
        return getHorasParqueo()*2000;
    }
    
    public String tostring(){
        return "Vehiculo: Automovil | placa: "+placa+"| Horas: "+ getHorasParqueo()+"| Total: $"+ calcularCosto();
    }
}
