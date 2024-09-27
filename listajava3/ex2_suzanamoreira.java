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
public class ex2_suzanamoreira {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
           int matricula,hora, horaExtra;
           double valorhoras , total, valorextra, totalExtra, amais;
           String mes;
           
           horaExtra = 0;
           totalExtra = 0;
           amais = 0;
           valorextra = 0;
           
            System.out.println("ensira matricula:");
            matricula = scan.nextInt();
            
            System.out.println("ensira o  numero de horas trabalhadas:");
            hora = scan.nextInt();
            
            System.out.println("ensira o valor da hora:");
            valorhoras = scan.nextInt();
            
            System.out.println("ensira o mes:");
            mes = scan.next();
            
            total = valorhoras * hora ;
           
            
            if(hora > 200){
                horaExtra = hora - 200;
                valorextra = horaExtra * valorhoras; //100
                
                amais = valorextra * 50 /100;
                
                valorextra = valorextra + amais;
                
                total = (total - horaExtra) + valorextra;
            } 
               
            
     
            System.out.println(total + " - " + horaExtra + " - " + valorextra);
            
        
    }
    
}
