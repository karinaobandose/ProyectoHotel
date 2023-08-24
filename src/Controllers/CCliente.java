/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.MCliente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author emalo
 */
public class CCliente implements Controlador<MCliente> {

    private ArrayList<MCliente> Lista = new ArrayList<>();
    private MCliente Cliente;

    @Override
    public ArrayList<MCliente> getLista() {
        return Lista;
    }

    @Override
    public void setObjecto(MCliente objecto) {
        this.Cliente = objecto;
    }

    @Override
    public MCliente getObjecto() {
        return Cliente;
    }

    @Override
    public void Crear(MCliente objecto) {
        this.Lista.add(objecto);
    }

    @Override
    public MCliente Buscar(Integer objecto) {
        MCliente temp = null;
        for (MCliente mHabitacion : Lista) {
            if (mHabitacion.getCedula().equals(objecto)) {
                temp = mHabitacion;
                break;
            }
        }

        return temp;
    }

    @Override
    public void Leer(MCliente objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Leer(String objecto) {
        try {
            Integer temp = Integer.valueOf(objecto);

            System.out.println("La cedula es " + temp);
            for (MCliente MCliente : Lista) {
                if (MCliente.getCedula().equals(temp)) {
                    this.Cliente = MCliente;
                    break;
                }
                this.Cliente = null;
            }

            System.out.println("El modelo es " + this.Cliente);
        } catch (Exception e) {
            System.out.println("No se puede");
        }

    }

    @Override
    public void Leer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Actualizar(MCliente objecto) {
        int CedulaTemp = objecto.getCedula();
        MCliente ClienteTemp = null;
        for (MCliente mHabitacion : Lista) {

            if (mHabitacion.getCedula().equals(CedulaTemp)) {
                ClienteTemp = mHabitacion;
                break;
            }
        }

        ClienteTemp.setNombre(objecto.getNombre());
        ClienteTemp.setTelefono(objecto.getTelefono());
        ClienteTemp.setCorreo(objecto.getCorreo());
    }

    @Override
    public void Actualizar(String objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar(MCliente objecto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "CCliente{" + "Lista=" + Lista + '}';
    }

}
