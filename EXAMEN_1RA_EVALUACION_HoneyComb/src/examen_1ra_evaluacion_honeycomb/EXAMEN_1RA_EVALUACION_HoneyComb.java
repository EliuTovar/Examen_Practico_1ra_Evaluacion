/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_1ra_evaluacion_honeycomb;

import clases_examen.DatosIntegrantes;


/**
 *
 * @author tovar
 */
public class EXAMEN_1RA_EVALUACION_HoneyComb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DatosIntegrantes obj1 = new DatosIntegrantes();
        System.out.println("1. CLASE DATOS DEL EQUIPO");
        System.out.println("Numero de control: " + DatosIntegrantes.numeroControl(21550363));
        System.out.println("Carrera: " + DatosIntegrantes.Carrera("Ingenieria en Sistemas Computacionales"));
        System.out.println("Nombre: " + DatosIntegrantes.Nombre("Eliu David"));
        System.out.println("Apellidos: " + DatosIntegrantes.Apellidos("Tovar Escobar"));
        System.out.println("Nombre del equipo: " + DatosIntegrantes.NombreDelEquipo("HoneyComb"));
        System.out.println("");
        System.out.println("Numero de control: " + DatosIntegrantes.numeroControl(21550338));
        System.out.println("Carrera: " + DatosIntegrantes.Carrera("Ingenieria en Sistemas Computacionales"));
        System.out.println("Nombre: " + DatosIntegrantes.Nombre("Javier"));
        System.out.println("Apellidos: " + DatosIntegrantes.Apellidos("Prieto"));
        System.out.println("Nombre del equipo: " + DatosIntegrantes.NombreDelEquipo("HoneyComb"));
        System.out.println("");
        System.out.println("Numero de control: " + DatosIntegrantes.numeroControl(21550301));
        System.out.println("Carrera: " + DatosIntegrantes.Carrera("Ingenieria en Sistemas Computacionales"));
        System.out.println("Nombre: " + DatosIntegrantes.Nombre("Diana Jaqueline"));
        System.out.println("Apellidos: " + DatosIntegrantes.Apellidos("Arzaga Perez"));
        System.out.println("Nombre del equipo: " + DatosIntegrantes.NombreDelEquipo("HoneyComb"));
        
        System.out.println("");
        
        obj1.ImprimirProblemasResueltos();
        
        
        
        
        
        
        
    }
    
}
