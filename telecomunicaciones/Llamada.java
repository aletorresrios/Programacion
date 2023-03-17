/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema8.telecomunicaciones;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Windows
 */
public class Llamada implements Comparable{
    String tlfCliente;
    String tlfInterlocutor;
    boolean saliente;
    LocalDateTime inicio;
    LocalDateTime finaly;
    int zona;
    Double [] tarifa= {0.2, 0.15, 0.1, 0.05, 0.3};

    Llamada(String tlfCliente, String tlfInterlocutor, boolean saliente, LocalDateTime inicio, LocalDateTime finaly,int zona) {
        this.tlfCliente = tlfCliente;
        this.tlfInterlocutor = tlfInterlocutor;
        this.saliente = saliente;
        this.inicio = inicio;
        this.finaly = finaly;
        this.zona=zona;
    }
    
    
    
    @Override
    public int compareTo (Object o){
        
        int res = tlfCliente.compareTo(((Llamada)o).tlfCliente);
        if(res==0){
            res = inicio.compareTo(((Llamada)o).inicio);
        }
        return res;
    }
    int duracion(){
        int resdur;
        resdur = (int) inicio.until(finaly, ChronoUnit.MINUTES);
        return resdur;
    }
    double coste(){
        double res=0;
        if(saliente==true){
            switch (zona) {
                case 1:
                    res=duracion()*tarifa[0];
                    break;
                case 2:
                    res=duracion()*tarifa[1];
                    break;
                case 3:
                    res=duracion()*tarifa[2];
                    break;
                case 4:
                    res=duracion()*tarifa[3];
                    break;
                case 5:
                    res=duracion()*tarifa[4];
                    break;
                default:
                    break;
            }
            }else{
                res=0;
            }
        return res; 
    }

    @Override
    public String toString() {
        return "\n" + "En la llamada el telefono del cliente fue " + tlfCliente + "  el del interlocutor " + tlfInterlocutor + ", la llamada comenzo" + inicio + "  la duracion fue de " +duracion()+ " y la llamada tuvo un coste de " + coste() ;
    }
    
}
