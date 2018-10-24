/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author dmorenoar
 */
public class JavaDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de una fecha usando la fecha actual
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha actual sin formatear: " + fecha);

        //Añadir un formato determinado a la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Hoy es dia: " + formato.format(fecha));

        //Definimos la hora
        LocalTime tiempo = LocalTime.now();
        System.out.println("Hora actual sin formatear: " + tiempo);
        
        //Añadir un formato a la hora
        System.out.println("Hora: " + tiempo.getHour() + "h:" + tiempo.getMinute() + "m:" + tiempo.getSecond() + "s");
          
    }

}
