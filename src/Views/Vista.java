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
    
    public static int messageTypeSuccess=1;
    public static int messageTypeError=2;
    public static int messageTypeConfirm=3;
    
    public void setControlador(Controlador controlador);
    public void showData();
    public void showMessage(String msg,int messageType);
}
