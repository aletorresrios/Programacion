/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema7.aeropuerto;

import java.util.Arrays;

/**
 *
 * @author Windows
 */
public class Azafato extends Persona{
    double sueldo;
    String [] idioma;

    public Azafato(double sueldo, String[] idioma, String nombre, String apellidos, String dni, String mail) {
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
        this.idioma = idioma;
    }

    @Override
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(this.sueldo);
        System.out.println(Arrays.toString(idioma));
    }

    public double getSueldo() {
        return sueldo;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }
    
    
}
