/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author tovar
 */
public class FichaBibliografica {
    public static void atributos() {
        metodos obj = new metodos();
        System.out.println("Autor:" + obj.getAutor());
        System.out.println("Nombre del sitio web:" + obj.getSitioWeb());
        System.out.println("Dia de publicacion:" + obj.getDia());
        System.out.println("Mes de publicacion:" + obj.getMes());
        System.out.println("Año de publicacion:" + obj.getAño());
        System.out.println("URL del libro:" + obj.getURL());

        metodos obj2 = new metodos("Antoine de Saint-Exupéry", "El principito", 1943, "Nueva York");
        System.out.println("Autor:" + obj2.getAutor());
        System.out.println("Titulo:" + obj2.getTitulo());
        System.out.println("Año publicacion:" + obj2.getAño());
        System.out.println("Ciudad:" + obj2.getCiudad());

    }
}

class metodos {

    //atributos
    private String Autor;
    private String SitioWeb;
    private int año;
    private int mes;
    private int dia;
    private String URL;
    private String Titulo;
    private String Ciudad;

    //Constructor sin parametros
    public metodos() {
        Autor = "Antoine de Saint-Exupéry";
        SitioWeb = "Obras clasicas de siempre";
        año = 1943;
        mes = 04;
        dia = 06;
        URL = "http://bibliotecadigital.ilce.edu.mx/Colecciones/ObrasClasicas/_docs/ElPrincipito.pdf";

    }

    //constructor con parametros 
    public metodos(String Autor, String Titulo, int año, String Ciudad) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.año = año;
        this.Ciudad = Ciudad;

    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getSitioWeb() {
        return SitioWeb;
    }

    public void setSitioWeb(String SitioWeb) {
        this.SitioWeb = SitioWeb;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void imprimirFicha() {
        
        System.out.println("Ficha Bibliografica formato APA:" + Autor + año);
    }
}
