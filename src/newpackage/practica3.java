/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Lab3
 */
public class practica3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lapiz;
        float precio;
        System.out.println("dame el numero");
        lapiz = leer.nextInt();
        if (lapiz>=100) {
            precio =0.85f;
            
                 
        } else {
            
            precio = 0.90f;
        }
        System.out.println("pagar" = +(lapiz*precio));
        
    }   
}
