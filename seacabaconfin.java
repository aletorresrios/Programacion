/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class seacabaconfin {
    public static void main(String[] args) {
        try {
            BufferedWriter f1= new BufferedWriter(new FileWriter("finalconfin.txt", true)) ;
            String t=" ";
            Scanner atr = new Scanner (System.in);
//            t= atr.next(t);
            while(!t.equals("fin")){
                t= atr.next();
                f1.write(t);
                f1.newLine();
                f1.flush();
            }
            f1.close();
        } catch (Exception e) {
        }
    }
}
