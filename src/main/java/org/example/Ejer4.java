package org.example;

import java.util.Scanner;



public class Ejer4 {
    public static void main(String[] args){
        int num1;


        Scanner leer = new Scanner(System.in);

        System.out.print("Numero 1: ");
        num1 = leer.nextInt();

        if ( num1 % 3 == 0 || num1 % 5 == 0) {
        System.out.println("El nummero es multiplo de 3 y 5");
        }else {
            System.out.println("El nummero  no es multiplo de 3 y 5");

        }




    }
}
