/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.MHabitacion;
import java.util.ArrayList;

/**
 *
 * @author emalo
 */
public class CHabitaciones implements Controlador<MHabitacion>{
    
    private ArrayList<MHabitacion> Lista = new ArrayList<>();
    private MHabitacion Habitacion;
    
    

    @Override
    public ArrayList<MHabitacion> getLista() {
        return Lista;
    }

    @Override
    public void setObjecto(MHabitacion objecto) {
        this.Habitacion = objecto;
    }

    @Override
    public MHabitacion getObjecto() {
        return Habitacion;
    }

    @Override
    public void Crear(MHabitacion objecto) {
        this.Lista.add(objecto);
    }

    @Override
    public void Leer(MHabitacion objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Leer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Actualizar(MHabitacion objecto) {
        int NumeroTemp = objecto.getNumero();
        MHabitacion mHabitaciontemp = null;
        for (MHabitacion mHabitacion : Lista) {
            if (mHabitacion.getNumero().equals(NumeroTemp)) {
                mHabitaciontemp=mHabitacion;
                break;
            }
        }
        
        mHabitaciontemp.setTipo(objecto.getTipo());
    }

    @Override
    public void Eliminar(MHabitacion objecto) throws Exception{
        int NumeroTemp = objecto.getNumero();
        MHabitacion mHabitaciontemp = null;
        for (MHabitacion mHabitacion : Lista) {
            if (mHabitacion.getNumero().equals(NumeroTemp)) {
                if (!mHabitacion.isEstado()) {
                    mHabitaciontemp=mHabitacion;
                }
                break;
            }
        }
        if (mHabitaciontemp == null) {
            System.out.println("Null");
            throw new Exception("El dato no se puede eliminar");
        
        }
        
        this.getLista().remove(mHabitaciontemp);
    }

    
    @Override
    public void Leer(String objecto) {
        
        try {
            Integer temp = Integer.valueOf(objecto);
            
            System.out.println("El numero es " + temp);
            for (MHabitacion mHabitacion : Lista) {
                if (mHabitacion.getNumero().equals(temp)) {
                    this.Habitacion = mHabitacion;
                    break;
                }
                this.Habitacion=null;
            }
            
            System.out.println("El modelo es " + this.Habitacion);
        } catch (Exception e) {
            System.out.println("No se puede");
        }
        
        
    
    }

    @Override
    public MHabitacion Buscar(Integer objecto) {
        MHabitacion temp = null;
        for (MHabitacion mHabitacion : Lista) {
            if (mHabitacion.getNumero().equals(objecto)) {
                temp = mHabitacion;
                break;
            }
        }
        
        return temp;
    }

    @Override
    public void Actualizar(String objecto) {
//        Buscar(Integer.valueOf(objecto)).setTipo(Integer.SIZE);
    }
    
}
