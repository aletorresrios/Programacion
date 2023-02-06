/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6.videoclub;

/**
 *
 * @author Windows
 */
public class Cuerpo {
    Ejemplar ejemplar;
    Cuerpo(){
    }
    void insertarCuerpo(Ejemplar ejemplar){
        this.ejemplar=ejemplar;
    }
    void eliminarCuerpo(){
        this.ejemplar=null;
    }
}
