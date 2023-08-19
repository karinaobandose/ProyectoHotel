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
public class MCliente {
    private int Cedula;
    private String Nombre;
    private LocalDate FechaNacimiento;
    private String Telefono;
    private String Correo;

    public MCliente(int Cedula, String Nombre, LocalDate FechaNacimiento, String Telefono, String Correo) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }
    
    public int CalcularEdad(LocalDate FechaNacimiento) {
        LocalDate FechaActual = LocalDate.now();
        Period periodo = Period.between(FechaNacimiento, FechaActual);
        return periodo.getYears();
    } 

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "MCliente{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + ", Telefono=" + Telefono + ", Correo=" + Correo + '}';
    }
    
    
}
