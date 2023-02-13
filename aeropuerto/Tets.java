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
public class Tets {
    public static void main(String[] args) {
    String[] i={"Ingles", "Español"}; 
    Azafato a = new Azafato(1200, i, "Jose Luis", "Lopez Caro", "98345678J", "elhumilda@gmail.com");
    Piloto p = new Piloto(Rango.AGUILA, 1000, false, "Jose Manuel", "Verdugo Mejias", "77868144J", "pini09@gmail.com");
    Pasajero pa1 = new Pasajero(120, "Pablo", "Cubero Luque", "98431267K", "pasteleriacubero@gmail.com");
    Pasajero pa2 = new Pasajero(121, "Nandito", "Martinez Zayas", "94631267H", "nandopranks@gmail.com");
    Trabajador t1 = new Trabajador(990, "Olga", "Rios Dominguez", "34857963L", "olri1976@gmail.com");
    Trabajador t2 = new Trabajador(1200, "Julia", "Garcia de la Vega", "89123456", "juls@gmail.com");
    Trabajador t3 = new Trabajador(1201, "Lucia", "Garcia Garcia", "78234569P", "garciagarcia@gmail.com");
    Pasajero [] pas ={pa1,pa2};
    Vuelo v1 = new Vuelo("Sevilla", "Kiev", p, pas, 600);
    pa1.añadirpasajero(pa1, 0);
    pa2.añadirpasajero(pa2, 1);
    pa2.mostrarpasajeros();
    v1.mostrarvuelo();
    }
}
