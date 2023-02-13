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
public class Vuelo {
    String ciudadO;
    String ciudadD;
    Piloto piloto;
    Pasajero [] pasajeros;
    int duracion;

    public Vuelo(String ciudadO, String ciudadD, Piloto piloto, Pasajero[] pasajeros, int duracion) {
        this.ciudadO = ciudadO;
        this.ciudadD = ciudadD;
        this.piloto = piloto;
        this.pasajeros = pasajeros;
        this.duracion = duracion;
    }
    void mostraPasajeros(){
        System.out.println(Arrays.toString(this.pasajeros));
    }

    public String getCiudadO() {
        return ciudadO;
    }

    public String getCiudadD() {
        return ciudadD;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setCiudadO(String ciudadO) {
        this.ciudadO = ciudadO;
    }

    public void setCiudadD(String ciudadD) {
        this.ciudadD = ciudadD;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    void mostrarvuelo (){
        System.out.println("El vuelo con destino" +this.ciudadD+" y origen " +this.ciudadO+ "tendra una duracion de "+this.duracion+ "minutos");
    }
    }

