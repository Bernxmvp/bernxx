/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_3;
import java.util.Scanner;
/**
 *
 * @author Lab3
 */
public class actividad3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int balas = 1;
        String posEnemigo = "media";
        String energia = "alta";
        int salud = 80;
        boolean p,q,r,s,respuesta;
       p=balas>=1;
       q=!posEnemigo.equals("baja");
       r=energia.equals("alta") || energia.equals("media");
       s=salud>51;
       respuesta = p && q && r && s;
       System.out.println("puedes atacar?" + respuesta);
       
    }
    
}
