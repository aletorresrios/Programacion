/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema7.aeropuerto;

/**
 *
 * @author Windows
 */
public class Persona {
    String nombre;
    String apellidos; 
    String dni;
    String mail;

    Persona(String nombre, String apellidos, String dni, String mail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.mail = mail;
    }
    void mostrarDatos(){
        
        System.out.println(this.nombre);
        System.out.println(this.apellidos);
        System.out.println(this.dni);
        System.out.println(this.mail);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getMail() {
        return mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
