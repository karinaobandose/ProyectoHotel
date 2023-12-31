/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author emalo
 */
public class MHabitacion {
    private Integer Numero;
    private Integer Tipo; //1-Individual, 2-Doble, 3-Suite
    private boolean Estado; //true-Ocupado, false-Libre
    private Double Precio;

    public MHabitacion(Integer Numero, Integer Tipo) {
        this.Numero = Numero;
        this.Tipo = Tipo;
        this.Estado = false;
        SaberPrecio(Tipo);
    }

    public MHabitacion(Integer Numero, Integer Tipo, double Precio) {
        this.Numero = Numero;
        this.Tipo = Tipo;
        this.Estado = false;
        this.Precio = Precio;
    }
    
    public void SaberPrecio(Integer Tipo){
        switch(Tipo){
            case 1 ->{this.Precio=45000.0;}
            case 2 ->{this.Precio=80000.0;}
            case 3 ->{this.Precio=140000.0;}
        }
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public Integer getTipo() {
        return Tipo;
    }

    public void setTipo(Integer Tipo) {
        this.Tipo = Tipo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "MHabitacion{" + "Numero=" + Numero + ", Tipo=" + Tipo + ", Estado=" + Estado + ", Precio=" + Precio + '}';
    }
    
    
    
}
