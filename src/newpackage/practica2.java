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
public class practica2 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in); 
        int c1 ;
        System.out.println("dame el dunmero");
        c1 = leer.nextInt();
        if (c1==0) {
            System.out.println("es cero");
        } else {
            if (c1>0) {
                System.out.println("es positivo");
            } else {
                System.out.println("es negativo");
            }
            
        }
        
    }
}
