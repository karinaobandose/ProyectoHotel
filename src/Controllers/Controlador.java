/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controllers;

import java.util.ArrayList;

/**
 *
 * @author emalo
 */
public interface Controlador<Objecto> {
    public ArrayList<Objecto> getLista();
    public void setObjecto(Objecto objecto);
    public Objecto getObjecto();
//    public void setView(View view);
    public void Crear(Objecto objecto);
    public Objecto Buscar(Integer objecto);
    public void Leer(Objecto objecto);
    public void Leer(String objecto);
    public void Leer();
//    public void read(String filter);
    public void Actualizar(Objecto objecto);
    public void Actualizar(String objecto);
    public void Eliminar(Objecto objecto) throws Exception;
}
