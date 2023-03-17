/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema8.telecomunicaciones;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

/**
 *
 * @author Windows
 */
public class Tets {
    public static void main(String[] args) {
        LocalDateTime a= LocalDateTime.of(2020, Month.MARCH, 21, 12, 30);
        LocalDateTime b=LocalDateTime.of(2020, Month.MARCH, 21, 13, 15);
        LocalDateTime c= LocalDateTime.of(2020, Month.MARCH, 21, 11, 30);
        Llamada l1= new Llamada("657625338", "955576897", true, a, b, 1);
        Llamada l2= new Llamada("656789234", "955576897", false, c, b, 2);
        Llamada l3= new Llamada("656989234", "955576897", true, c, a, 2);
        Llamada []t = new Llamada[]{l1,l2,l3};
        System.out.println(Arrays.toString(t));
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        
        
    }
}
