/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6.videoclub;

/**
 *
 * @author Windows
 */
public class Cliente {
    int codigo;
    String nombre;
    Bono bono;

    Cliente() {  
    }
    void regitrarCliente(int codigo, String nombre, Bono bono){
        this.codigo=codigo;
        this.nombre=nombre;
        this.bono=bono;
    }
    void setCod(int codigo){
        this.codigo=codigo;
    }
    void setNom(String nombre){
        this.nombre=nombre;
    }
    void setBono(Bono bono){
        this.bono=bono;
    }
    void eliminarCliente(){
        this.nombre=null;
        this.codigo=0;
        this.bono=null;
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
    void insertarCliente(){
    //TODO
    }
}
