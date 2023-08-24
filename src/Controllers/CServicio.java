/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.MServicio;
import java.util.ArrayList;

/**
 *
 * @author emalo
 */
public class CServicio implements Controlador<MServicio> {

    private ArrayList<MServicio> Lista = new ArrayList<>();
    private MServicio Servicio;

    @Override
    public ArrayList<MServicio> getLista() {
        return Lista;
    }

    @Override
    public void setObjecto(MServicio objecto) {
        this.Servicio = objecto;
    }

    @Override
    public MServicio getObjecto() {
        return Servicio;
    }

    @Override
    public void Crear(MServicio objecto) {
        this.Lista.add(objecto);
    }

    @Override
    public MServicio Buscar(Integer objecto) {
        MServicio temp = null;
        for (MServicio MServicio : Lista) {
            if (MServicio.getCodigo().equals(objecto)) {
                temp = MServicio;
                break;
            }
        }

        return temp;
    }

    @Override
    public void Leer(MServicio objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Leer(String objecto) {

        try {
            Integer temp = Integer.valueOf(objecto);

            System.out.println("El numero es " + temp);
            for (MServicio MServicio : Lista) {
                if (MServicio.getCodigo().equals(temp)) {
                    this.Servicio = MServicio;
                    break;
                }
                this.Servicio = null;
            }

            System.out.println("El modelo es " + this.Servicio);
        } catch (Exception e) {
            System.out.println("No se puede");
        }
    }

    @Override
    public void Leer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Actualizar(MServicio objecto) {
        int NumeroTemp = objecto.getCodigo();
        MServicio MServicioTemp = null;
        for (MServicio MServicio : Lista) {
            if (MServicio.getCodigo().equals(NumeroTemp)) {
                MServicioTemp = MServicio;
                break;
            }
        }

        MServicioTemp.setDescripcion(objecto.getDescripcion());
        MServicioTemp.setPrecio(objecto.getPrecio());
    }

    @Override
    public void Actualizar(String objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar(MServicio objecto) throws Exception {
        int NumeroTemp = objecto.getCodigo();
        MServicio MServicioTemp = null;
        for (MServicio MServicio : Lista) {
            if (MServicio.getCodigo().equals(NumeroTemp)) {
                MServicioTemp = MServicio;
                break;
            }
        }
        if (MServicioTemp == null) {
            System.out.println("Null");
            throw new Exception("El dato no se puede eliminar");

        }

        this.getLista().remove(MServicioTemp);
    }

}
