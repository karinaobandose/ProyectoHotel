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
    private Integer Precio;

    public MHabitacion(Integer Numero, Integer Tipo, boolean Estado) {
        this.Numero = Numero;
        this.Tipo = Tipo;
        this.Estado = Estado;
        SaberPrecio(Tipo);
    }
    
    public void SaberPrecio(Integer Tipo){
        switch(Tipo){
            case 1 ->{this.Precio=45000;}
            case 2 ->{this.Precio=80000;}
            case 3 ->{this.Precio=140000;}
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

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }
    
    
    
}
