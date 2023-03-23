/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema9.scannerUS;

/**
 *
 * @author Windows
 */
public class Deportista {
    String nombre; int edad; double estatura;

    public Deportista(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Deportista{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    
}
