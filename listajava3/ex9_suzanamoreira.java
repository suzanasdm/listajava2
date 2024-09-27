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
public class ex9_suzanamoreira {public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    double total , valorp, desc;
    int codigo, qparcela;
            System.out.println("ensira o codigo da compra:");
            codigo =scan.nextInt();
            
            System.out.println("ensira o valor total da compra:");
            total =scan.nextDouble();
            
            
            
            switch(codigo){
                case 1:
                    desc = total * 10/100;
                    total = total - desc;
                    
                    System.out.println("Valor Total: " + total + " Parcelas: A vista ");
                    break;
                    
                case 2: desc = total * 8/100;
                    total = total - desc;
                    
                    System.out.println("Valor Total: " + total + " Parcelas: 1 parcela");
                    
                    
                    
                    
                    break;
                case 3:
                    total = total/ 5;
                    
                    
                    System.out.println("Valor Total: " + total + " Parcelas: 5 parcelas");
                    
                    break;
                case 4:
                   desc = total * 5/100; 
                    total = total - desc; 
                    total = total / 10; 
                     System.out.println("Valor Total: " + total + " Parcelas: 10 parcelas");
                    break;
                    default:
            }
            
        
    }
    
}
