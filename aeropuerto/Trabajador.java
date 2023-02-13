/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema7.aeropuerto;

/**
 *
 * @author Windows
 */
public class Trabajador extends Persona{
    double sueldo;

    public Trabajador(double sueldo, String nombre, String apellidos, String dni, String mail) {
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
    }

    @Override
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(this.sueldo);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
}
