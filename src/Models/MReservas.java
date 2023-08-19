/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author emalo
 */
public class MReservas {
    
    private Integer NumeroReserva;
    private MCliente Cliente;
    private MHabitacion Habitacion;
    private LocalDate FechaEntrada;
    private LocalDate FechaSalida;
    private Integer Estado; //1-Pendiente, 2-En ejecucion, 3-Finalizada, 4-Cancelada
    private Double Subtotal;
    private Double Impuestos;
    private Double Total;

    
    
    public void Calcular(LocalDate FechaEntrada, LocalDate FechaSalida) {
        Period period = Period.between(FechaEntrada, FechaSalida);
        
        this.Subtotal = (this.Total / (1+0.13))
        
    }
    
}
