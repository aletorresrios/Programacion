/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema9.derealesadouble;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Sumadedoubles {
    public static void main(String[] args) {
        double suma=0;
        FileReader in= null;
        try {
            Scanner sc = new Scanner(new File("numerosreales.txt"));
            
            
            while(sc.hasNextLine()){
                suma = suma + Double.parseDouble(sc.nextLine()) ;
                
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("La suma de los numeroas del archivo es: "+suma );
    }
}
