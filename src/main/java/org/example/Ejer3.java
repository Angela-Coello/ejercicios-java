package org.example;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        int num1 ;
        int num2 ;
        Scanner leer = new Scanner(System.in);

       System.out.print("Numero 1: ");
       num1 = leer.nextInt();

       System.out.print("Numero 2 : ");
       num2 = leer.nextInt();

        int resultado;
        if (num1 > num2){
           resultado = num1;
       }else {
           resultado = num2;
       }
       System.out.println(" ");
       System.out.println("Numero mayor: " + resultado) ;
    }

}