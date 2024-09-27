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
public class ex6_suzanamoreira {public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor1 , valor2;
        char simbolo;
            System.out.println("digite o valor 1:");
            valor1 = scan.nextDouble();
            
            System.out.println("ensira o simbolo numerico:");
            simbolo =scan.next().charAt(0);
            
            System.out.println("digite o valor 1:");
            valor2 = scan.nextDouble();
            
            switch (simbolo){
                case'+':System.out.println("expressao:"+valor1 +"+"+valor2);
                    System.out.println("resultado:" +(valor1+valor2));
                    break;
                    case'-':System.out.println("expressao:"+valor1 +"-"+valor2);
                    System.out.println("resultado:" +(valor1-valor2));
                    break;
                    case'*':System.out.println("expressao:"+valor1 +"*"+valor2);
                    System.out.println("resultado:" +(valor1*valor2));
                    break;
                    case'/':System.out.println("expressao:"+valor1 +"/"+valor2);
                    System.out.println("resultado:" +(valor1/valor2));
                    break;
                    default:
                        System.out.println("simbolo invalido!");
                        break;
                    
                    
                    
            
            }
            
        
    }
    
}
