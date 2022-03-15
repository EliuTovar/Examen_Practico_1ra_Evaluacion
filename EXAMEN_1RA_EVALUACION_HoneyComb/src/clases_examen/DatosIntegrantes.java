/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;



/**
 *
 * @author tovar
 */
public class DatosIntegrantes {
    
    public static int numeroControl(int num1){
        int numControl = num1;
        return numControl;   
    }
    
    public static String Carrera(String carr){
        String carrera = carr;
        return carr;
    }
    
    public static String Nombre(String nom){
        String nombre = nom;
        return nombre;
    }
    
    public static String Apellidos(String apell){
        String apellidos = apell;
        return apellidos;
    }
    
    public static String NombreDelEquipo(String nomDequi){
        String nombredelequipo = nomDequi;
        return nombredelequipo;
    }
    public void ImprimirProblemasResueltos(){
        
        Pelicula pelicu = new Pelicula();
        pelicu.imprimirDatos();
        
        System.out.println("");
        
        metodos metod = new metodos();
        metod.imprimirFicha();
        
        System.out.println("");
        
        Contraseña contra = new Contraseña();
        contra.imprimirDatos();
        
        
      
        
        
  
    }
}
