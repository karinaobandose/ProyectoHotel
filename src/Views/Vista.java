/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Views;

import Controllers.Controlador;

/**
 *
 * @author emalo
 */
public interface Vista {
    
    public static int Correcto=1;
    public static int Error=2;
    public static int messageTypeConfirm=3;
    
    public void setControlador(Controlador controlador);
    public Controlador getControlador();
    public void showData();
    public void showMessage(String msg,int messageType);
}
