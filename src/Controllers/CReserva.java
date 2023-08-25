/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.MReservas;
import java.util.ArrayList;

/**
 *
 * @author emalo
 */
public class CReserva implements Controlador<MReservas> {

    private ArrayList<MReservas> Lista = new ArrayList<>();
    private MReservas Reservas;

    @Override
    public ArrayList<MReservas> getLista() {
        return Lista;
    }

    @Override
    public void setObjecto(MReservas objecto) {
        this.Reservas = objecto;
    }

    @Override
    public MReservas getObjecto() {
        return Reservas;
    }

    @Override
    public void Crear(MReservas objecto) {
        this.Lista.add(objecto);
    }

    @Override
    public MReservas Buscar(Integer objecto) {
        MReservas temp = null;
        for (MReservas MReservas : Lista) {
            if (MReservas.getNumeroReserva().equals(objecto)) {
                temp = MReservas;
                break;
            }
        }

        return temp;
    }

    @Override
    public void Leer(MReservas objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Leer(String objecto) {

        try {
            Integer temp = Integer.valueOf(objecto);

            System.out.println("El numero es " + temp);
            for (MReservas MReservas : Lista) {
                if (MReservas.getNumeroReserva().equals(temp)) {
                    this.Reservas = MReservas;
                    break;
                }
                this.Reservas = null;
            }

            System.out.println("El modelo es " + this.Reservas);
        } catch (Exception e) {
            System.out.println("No se puede");
        }
    }

    @Override
    public void Leer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Actualizar(MReservas objecto) {
        int NumeroTemp = objecto.getNumeroReserva();
        MReservas MReservasTemp = null;
        for (MReservas MReservas : Lista) {
            if (MReservas.getNumeroReserva().equals(NumeroTemp)) {
                MReservasTemp = MReservas;
                break;
            }
        }
       
       

        MReservasTemp.setEstado(objecto.getEstado());
    }

    @Override
    public void Actualizar(String objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar(MReservas objecto) throws Exception {
        int NumeroTemp = objecto.getNumeroReserva();
        MReservas MReservasTemp = null;
        for (MReservas MReservas : Lista) {
            if (MReservas.getNumeroReserva().equals(NumeroTemp)) {
                MReservasTemp = MReservas;
                break;
            }
        }

        if (MReservasTemp == null) {
            System.out.println("Null");
            throw new Exception("El dato no se puede eliminar");

        }

        MReservasTemp.setEstado(objecto.getEstado());
    }

}
