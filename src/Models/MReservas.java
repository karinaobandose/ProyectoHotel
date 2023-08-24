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
    private Integer Estadia;
    private Double Subtotal;
    private Double Impuestos;
    private Double Total;

    public MReservas(Integer NumeroReserva, MCliente Cliente, MHabitacion Habitacion, LocalDate FechaEntrada, LocalDate FechaSalida) {
        this.NumeroReserva = NumeroReserva;
        this.Cliente = Cliente;
        this.Habitacion = Habitacion;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
        this.Estado = 1;
        CalcularPrecio(this.FechaEntrada,this.FechaSalida);
    }
    
    
    public void CalcularPrecio(LocalDate FechaEntrada, LocalDate FechaSalida) {
        Period period = Period.between(FechaEntrada, FechaSalida);
        
        double Precio = Habitacion.getPrecio();
        int years = period.getYears()*365; //En caso de años los pasamos a dias
        int meses = period.getMonths()*30; //En caso de meses los pàsamos a dias
        int dias = period.getDays();
        this.Estadia = years + meses + dias;
        this.Subtotal = (Precio / (1+0.13)) * this.Estadia;
        this.Impuestos = this.Subtotal * 0.13;
        this.Total = this.Subtotal + this.Impuestos;
    }

    public Integer getNumeroReserva() {
        return NumeroReserva;
    }

    public void setNumeroReserva(Integer NumeroReserva) {
        this.NumeroReserva = NumeroReserva;
    }

    public MCliente getCliente() {
        return Cliente;
    }

    public void setCliente(MCliente Cliente) {
        this.Cliente = Cliente;
    }

    public MHabitacion getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(MHabitacion Habitacion) {
        this.Habitacion = Habitacion;
    }

    public LocalDate getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(LocalDate FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(LocalDate FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public Integer getEstado() {
        return Estado;
    }

    public void setEstado(Integer Estado) {
        this.Estado = Estado;
    }

    public Double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public Double getImpuestos() {
        return Impuestos;
    }

    public void setImpuestos(Double Impuestos) {
        this.Impuestos = Impuestos;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public Integer getEstadia() {
        return Estadia;
    }

    public void setEstadia(Integer Estadia) {
        this.Estadia = Estadia;
    }

    @Override
    public String toString() {
        return "MReservas{" + "NumeroReserva=" + NumeroReserva + ", Cliente=" + Cliente.getNombre() + ", Habitacion=" + Habitacion.getTipo() + ", FechaEntrada=" + FechaEntrada + ", FechaSalida=" + FechaSalida + ", Estado=" + Estado + ", Estadia=" + Estadia + ", Subtotal=" + Subtotal + ", Impuestos=" + Impuestos + ", Total=" + Total + '}';
    }

    
    
    
    
}
