/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.MEmpleado;
import java.util.ArrayList;

/**
 *
 * @author emalo
 */
public class CEmpleado implements Controlador<MEmpleado>{

    private ArrayList<MEmpleado> Lista = new ArrayList<>();
    private MEmpleado Empleado;

    
    @Override
    public ArrayList getLista() {
        return Lista;
    }

    @Override
    public void setObjecto(MEmpleado objecto) {
        this.Empleado = objecto;
    }
    
    @Override
    public MEmpleado getObjecto() {
        return Empleado;
    }

    @Override
    public void Crear(MEmpleado objecto) {
        this.Lista.add(objecto);
    }

    @Override
    public MEmpleado Buscar(Integer objecto) {
        MEmpleado temp = null;
        for (MEmpleado MEmpleado : Lista) {
            if (MEmpleado.getCedula().equals(objecto)) {
                temp = MEmpleado;
                break;
            }
        }

        return temp;   
    }

    @Override
    public void Leer(MEmpleado objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Leer(String objecto) {

        try {
            Integer temp = Integer.valueOf(objecto);

            System.out.println("El numero es " + temp);
            for (MEmpleado MEmpleado : Lista) {
                if (MEmpleado.getCedula().equals(temp)) {
                    this.Empleado = MEmpleado;
                    break;
                }
                this.Empleado = null;
            }

            System.out.println("El modelo es " + this.Empleado);
        } catch (Exception e) {
            System.out.println("No se puede");
        }    
    }

    @Override
    public void Leer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Actualizar(MEmpleado objecto) {
        int NumeroTemp = objecto.getCedula();
        MEmpleado MEmpleadoTemp = null;
        for (MEmpleado MEmpleado : Lista) {
            if (MEmpleado.getCedula().equals(NumeroTemp)) {
                MEmpleadoTemp = MEmpleado;
                break;
            }
        }

        MEmpleadoTemp.setNombre(objecto.getNombre());
        MEmpleadoTemp.setPuesto(objecto.getPuesto());
        MEmpleadoTemp.setTelefono(objecto.getTelefono());
    }

    @Override
    public void Actualizar(String objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar(MEmpleado objecto) throws Exception {
        int NumeroTemp = objecto.getCedula();
        MEmpleado MEmpleadoTemp = null;
        for (MEmpleado MEmpleado : Lista) {
            if (MEmpleado.getCedula().equals(NumeroTemp)) {
                MEmpleadoTemp = MEmpleado;
                break;
            }
        }
        if (MEmpleadoTemp == null) {
            System.out.println("Null");
            throw new Exception("El dato no se puede eliminar");

        }

        this.getLista().remove(MEmpleadoTemp);    
    }
    
}
