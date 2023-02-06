/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6.videoclub;

/**
 *
 * @author Windows
 */
public class Ejemplar {
    int codigo;
    String nombre;
    double precio;
    Ejemplar(){
    }
    void registrarEjemplar (int codigo, String nombre, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }
    void setCod(int codigo){
        this.codigo=codigo;
    }
    void setNombre(String nombre){
        this.nombre=nombre;
    }
    void setPrec(double precio){
        this.precio=precio;
    }
    void eliminarEjemplar(){
        this.codigo=0;
        this.nombre=null;
        this.precio=0;
    }
    void insertarEjemplar(){
    //TODO
    }
    void registrar(){
    //TODO
    }
    void modificar(){
    //TODO
    }
    void eliminar(){
    //TODO
    }
}
