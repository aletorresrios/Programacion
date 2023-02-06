/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6.videoclub;

/**
 *
 * @author Windows
 */
public class Alquiler {
    int numero;
    Cabecera cabecera;
    Reporte reporte;
    Cuerpo cuerpo;
    boolean devolucion;
    
    Alquiler(){
    }

    void realizarAlquiler(int numero, Cabecera cabecera, Reporte reporte, Cuerpo cuerpo) {
        this.numero = numero;
        this.cabecera = cabecera;
        this.reporte = reporte;
        this.cuerpo = cuerpo;
    }
    void eliminarAlquiler(int numero, Cabecera cabecera, Reporte reporte, Cuerpo cuerpo) {
        this.numero = 0;
        this.cabecera = null;
        this.reporte = null;
        this.cuerpo = null;
    }
    void realizarDevoluvion(boolean devolucion){
        this.devolucion=devolucion;
    }
    void registrar(){
    //TODO
    }
    void finalizarDevolucion(){
    //TODO
    }
    void eliminar(){
    //TODO
    }   
}
