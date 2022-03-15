/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

import java.util.Scanner;

/**
 *
 * @author tovar
 */
public class Pelicula {
    private String titulo;
    private String estudio;
    private int rating;
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public void imprimirDatos(){
        System.out.println("3. CLASE PELICULA:");
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = in.nextInt();
        
        Pelicula peli = new Pelicula();
        peli.setTitulo("Spiderman 3");
        peli.setEstudio("Marvel estudios");
        peli.setRating(edad);
        
        System.out.println("Pelicula: " + peli.getTitulo());
        System.out.println("Estudio: " + peli.getEstudio());
        System.out.println("Edad: " + peli.getRating());
        
    }
}
