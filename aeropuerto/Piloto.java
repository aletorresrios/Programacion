/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema7.aeropuerto;

/**
 *
 * @author Windows
 */
public class Piloto extends Persona {
    Rango rango;
    double sueldo;
    boolean vuelosI;

    public Piloto(Rango rango, double sueldo, boolean vuelosI, String nombre, String apellidos, String dni, String mail) {
        super(nombre, apellidos, dni, mail);
        this.rango = rango;
        this.sueldo = sueldo;
        this.vuelosI = vuelosI;
    }

    @Override
    void mostrarDatos() {
        super.mostrarDatos(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(this.rango);
        System.out.println(this.sueldo);
        System.out.println(this.vuelosI);
    }

    Rango getRango() {
        return rango;
    }

    double getSueldo() {
        return sueldo;
    }

    boolean getVuelosI() {
        return vuelosI;
    }

    void setRango(Rango rango) {
        this.rango = rango;
    }

    void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    void setVuelosI(boolean vuelosI) {
        this.vuelosI = vuelosI;
    }
    
    

    

    

    
    
}
