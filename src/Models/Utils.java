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
public class Utils {

    private int Numero = 0;

    public int getNumero() {
        return Numero;
    }

    public int CalcularEdad(LocalDate FechaNacimiento) {
        int temp = 0;
        LocalDate FechaActual = LocalDate.now();
        Period periodo = Period.between(FechaNacimiento, FechaActual);

        if (periodo.getYears() > 0 && periodo.getYears() < 200) {
            temp = periodo.getYears();
        }
        return temp;
    }

    public int AutoNumerico() {
        Numero++;
        return Numero;
    }

    public void CalcularPrecio(LocalDate FechaEntrada, LocalDate FechaSalida) {
//        Period period = Period.between(FechaEntrada, FechaSalida);
//
//        double Precio = Habitacion.getPrecio();
//        int years = period.getYears() * 365; //En caso de años los pasamos a dias
//        int meses = period.getMonths() * 30; //En caso de meses los pàsamos a dias
//        int dias = period.getDays();
//        this.Estadia = years + meses + dias;
//        this.Subtotal = (Precio / (1 + 0.13)) * this.Estadia;
//        this.Impuestos = this.Subtotal * 0.13;
//        this.Total = this.Subtotal + this.Impuestos;
    }

    public int CalcularEstadia(LocalDate FechaEntrada, LocalDate FechaSalida) {
        int temp = 0;
        Period period = Period.between(FechaEntrada, FechaSalida);

        int years = period.getYears() * 365; //En caso de años los pasamos a dias
        int meses = period.getMonths() * 30; //En caso de meses los pàsamos a dias
        int dias = period.getDays();
        
        int suma = years + meses + dias;
        if (suma>0){
            temp=years + meses + dias;
        }
        
        return temp;
    }

    public double CalcularSubtotal(double Precio, int Estadia) {

//        return ((Precio / (1 + 0.13)) * Estadia);
        return Math.round((((Precio / (1 + 0.13)) * Estadia)) * 100.0) / 100.0;

    }

    public double CalcularImpuestos(double Subtotal) {

        return Math.round((Subtotal * 0.13) * 100.0) / 100.0;

    }

    public double CalcularTotal(double Subtotal, double Impuestos) {
//        return Subtotal + Impuestos;
        return Math.round((Subtotal + Impuestos) * 100.0) / 100.0;
    }
}
