/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema9.scannerUS;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Scannerandcompany{
    public static void main(String[] args) {
        String nombre; int edad; double estatura;
        Scanner atr = new Scanner (System. in) . useLocale (Locale.US) ;
        System.out.print("Introduce tu nombre, edad, estatura:");
        nombre = atr.next(); 
        edad = atr.nextInt();
        estatura = atr.nextDouble();
        Deportista d1 = new Deportista(nombre, edad, estatura);
        System.out.println(d1.toString());
        
        
    }
}
