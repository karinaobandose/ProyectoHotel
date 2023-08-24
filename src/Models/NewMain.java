/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

import Controllers.CHabitaciones;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author emalo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MHabitacion x = new MHabitacion(1, 3, 2001.50);
//        MHabitacion b = new MHabitacion(2, 2);
//        MHabitacion c = new MHabitacion(3, 1);
//        
        System.out.println(x);
//        System.out.println(b);
//        System.out.println(c);

        MCliente c = new MCliente(504370845, "Emma", LocalDate.parse("2001-03-28"), "6161", "asd@gmail.com");

        System.out.println(c);
//        System.out.println(c.CalcularEdad(c.getFechaNacimiento()));

        MServicio v = new MServicio(1, "SSSS", "", 500000);

        System.out.println(v);

        MEmpleado b = new MEmpleado(504370845, "Rodriguez", "8888", 1);

        System.out.println(b);

        MReservas r = new MReservas(10, c, x, LocalDate.parse("2010-02-02"), LocalDate.parse("2010-02-03"));

        System.out.println(r);
        
        
        CHabitaciones list = new CHabitaciones();
        
        list.getLista().add(x);
        
        System.out.println(list.getLista());
    }

}
