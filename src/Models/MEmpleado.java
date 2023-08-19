/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author emalo
 */
public class MEmpleado {
    
    private Integer Cedula;
    private String Nombre;
    private String Telefono;
    private Integer Puesto; //1-Recepcionista, 2-Gerente, 3-Conserje, 4-Supervisor, 5-Mantenimiento
    private Integer Salario;

    public MEmpleado(Integer Cedula, String Nombre, String Telefono, Integer Puesto) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Puesto = Puesto;
        IngresarSalario(Puesto);
    }
    
    public void IngresarSalario(Integer Puesto){
        switch(Puesto){
            case 1 ->{this.Salario=800000;}
            case 2 ->{this.Salario=1400000;}
            case 3 ->{this.Salario=550000;}
            case 4 ->{this.Salario=1100000;}
            case 5 ->{this.Salario=650000;}
        }
    }

    public Integer getCedula() {
        return Cedula;
    }

    public void setCedula(Integer Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Integer getPuesto() {
        return Puesto;
    }

    public void setPuesto(Integer Puesto) {
        this.Puesto = Puesto;
    }

    public Integer getSalario() {
        return Salario;
    }

    public void setSalario(Integer Salario) {
        this.Salario = Salario;
    }
    
    
    
    
}
