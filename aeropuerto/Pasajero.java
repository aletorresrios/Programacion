/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema7.aeropuerto;

/**
 *
 * @author Windows
 */
public class Pasajero extends Persona{
    int pasaporte;
    Pasajero [] pasajeros;
    public Pasajero(int pasaporte, String nombre, String apellidos, String dni, String mail) {
        super(nombre, apellidos, dni, mail);
        this.pasaporte = pasaporte;
    }
    
    void añadirpasajero(Pasajero p, int a){
            pasajeros[a]= p;
        
    }
    @Override
    void mostrarDatos() {
        super.mostrarDatos(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(this.pasaporte);
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }
    public void mostrarpasajeros (){
        for (int i = 0; i < pasajeros.length; i++) {
            if(pasajeros[i]!=null)
            System.out.println(this.nombre);
        }
    }
}
