/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6.videoclub;

/**
 *
 * @author Windows
 */
public class Cabecera {
    Cliente cliente;
    FechaEntrega fechaentrega;
    
    void insertarCabecera(Cliente cliente, FechaEntrega fechaentrega){
        this.cliente=cliente;
        this.fechaentrega=fechaentrega;
    }
    void eliminarCabecera(){
        this.cliente=null;
        this.fechaentrega=null;
    }
}
