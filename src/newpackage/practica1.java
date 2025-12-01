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
public class practica1 {
    public static void main(String[] args) {
      //leer es un objeto
        Scanner leer = new Scanner(System.in);
      float c1, c2, c3, promedio;
        System.out.println("dame tres calificaciones");
        c1 = leer.nextFloat();
        c2 = leer.nextFloat();
        c3 = leer.nextFloat();
        promedio = (c1+c2+c3)/3;
        
        if (promedio>=70) {
            System.out.println("aprobado");
        } else {
            System.out.println("reprobado");
        }
            
        }
    }

