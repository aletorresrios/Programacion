/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Windows
 */
public class BilleteOculto {
    public static void main(String[] args) {
    String t [][]=new String [8][4];
    Random ale= new Random();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                t[i][j]="-";
            }  
        }
        t[ale.nextInt(7)][ale.nextInt(3)]="€"; 
        System.out.println(Arrays.toString(t[0]));
        System.out.println(Arrays.toString(t[1]));
        System.out.println(Arrays.toString(t[2]));
        System.out.println(Arrays.toString(t[3]));
        System.out.println(Arrays.toString(t[4]));
        System.out.println(Arrays.toString(t[5]));
        System.out.println(Arrays.toString(t[6]));
        System.out.println(Arrays.toString(t[7]));
    }
}
