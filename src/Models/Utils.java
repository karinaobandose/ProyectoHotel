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
        
        if (periodo.getYears()>0 && periodo.getYears()<200) {
            temp = periodo.getYears();
        }
        return temp;
    }
    
    public int AutoNumerico(){
        Numero++;
        return Numero;
    }
}
