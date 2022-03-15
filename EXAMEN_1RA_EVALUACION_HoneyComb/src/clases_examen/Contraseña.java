/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author tovar
 */
public class Contraseña {
    private String usuario;
    private int contraseña;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
    public Contraseña(){
        usuario = "HoneyComb";
        contraseña = 1234;
    }
    
    public Contraseña(String usuario, int contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    public void imprimirDatos(){
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contraseña);
    }
}
