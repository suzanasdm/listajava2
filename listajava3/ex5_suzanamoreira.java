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
public class ex5_suzanamoreira { public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int idade , ano ;
        
            System.out.println("digite seuano de nascimento:");
            ano = scan.nextInt();
            idade = 2024 - ano ;
            
            System.out.println("sua idade é:" + idade);
 
            
            if (idade>=16 && idade > 18){
            System.out.println("pode votar!!");}

            else if ( idade>= 18 ){
            System.out.println("pode tirar habilitacao.");}
            
            
            else if(idade < 16);{
            System.out.println("voce nao nao pode vota!!");}

            
            
}
}

    

