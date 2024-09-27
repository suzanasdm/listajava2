/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listajava3;

import java.util.Scanner;

/**
 *
 * @author suzana
 */
public class ex1_suzanamoreira {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     double r ;
     
     
     
        System.out.println("ensira o valor do raio:");
        r = scan.nextDouble();
        
       double volume = ((4.0 / 3.0)* Math.PI *(r*r*r));
        System.out.println("o volume da esfera é:" + volume);
        
    }
}
