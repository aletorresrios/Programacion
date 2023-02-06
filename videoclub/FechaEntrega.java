/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6.videoclub;

import java.util.Date;

/**
 *
 * @author Windows
 */
public class FechaEntrega {
    Date fecha;
    Cliente cliente;
    Ejemplar ejemplar;
    
    FechaEntrega(){  
    }

    FechaEntrega(Date fecha, Cliente cliente, Ejemplar ejemplar) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.ejemplar = ejemplar;
    }
    
}
