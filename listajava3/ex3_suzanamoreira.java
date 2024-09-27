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
public class ex3_suzanamoreira {public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1 ,num2 ,num3;
        
            System.out.println("ensira o numero 1:");
            num1 = scan.nextInt();
            
            System.out.println("ensira o numero 2:");
            num2 = scan.nextInt();
            
           System.out.println("ensira o numero 3:");
            num3 = scan.nextInt();
            
         if(num1 < num2){
             if(num2 < num3){
                 System.out.println(num1 + " - " + num2 + " - " + num3);
             } else {
                 System.out.println(num1 + " - " + num3 + " - " + num2);
             }
       } else if (num2 < num3){
           if(num3 < num1){
               System.out.println(num2+ " - " + num3 + " - " + num1);
           } else {
               System.out.println(num2+ " - " + num1 + " - " + num3);
           }
       } else {
           if (num3 < num2){
               System.out.println(num3 + " - " + num2 + " - " + num1);
           } else {
               System.out.println(num3 + " - " + num1 + " - " + num2);
           }
       }
                
    }
    
}
    

