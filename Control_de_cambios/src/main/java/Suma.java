/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Jordy
 */


class Suma {
    
    Scanner reader = new Scanner(System.in);

 
   public static void main( String[] args ) {
     int numero1 = 0;
     int numero2 = 0;
     int numero3 = 0;
     
     int resultado = 0;
     Scanner reader = new Scanner(System.in);
  
    System.out.println("Introduce el primer número:");      
    numero1 = reader.nextInt();

    System.out.println("Introduce el segundo número:");
    numero2 = reader.nextInt();
    
    System.out.println("Introduce el tercer número:");
    numero3 = reader.nextInt();


    resultado = numero1+numero2+numero3;

    System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + numero3 + " = "  + resultado);
}
}