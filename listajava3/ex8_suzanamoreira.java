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
public class ex8_suzanamoreira {public static void main(String[] args) {
        int idade;
        Scanner scan = new Scanner(System.in);
        
            System.out.println("ensira sua idade:");
            idade = scan.nextInt();
         switch(idade){
             
             case 5,6,7: 
                 System.out.println("Infantil A.");
                 break;
             case 8,9,10:
                 System.out.println("Infantil B.");
                 break;
             case 11,12,13:
                 System.out.println("Juvenil A.");
                 break;
             case 14,15,16,17:
                 System.out.println("Juvenil B.");
                 break;
             default:
                 System.out.println("categoria adulto.")
                 ;
                 break;
         
         }
        
    }
    
}
