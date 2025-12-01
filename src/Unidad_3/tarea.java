/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_3;
import java.util.Scanner;


public class tarea {
        public static void main(String[] args) {
        int n1, n2, n3, resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número: ");
        n1 = leer.nextInt();
        System.out.println("Dame otro número: ");
        n2 = leer.nextInt();
        System.out.println("dame el otro numero");
        n3 = leer.nextInt();
        resultado = n1 + n2 + n3;
        System.out.println("Resultado: " + resultado);
    }
}