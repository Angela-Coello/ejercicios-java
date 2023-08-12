package org.example;
import java.util.Scanner;



public class ejer2 {
    public static void main(String[] args){
        int num1;
        int num2;
        int cociente;
        int residuo;


        Scanner leer = new Scanner(System.in);

        System.out.print("Numero 1: ");
        num1 = leer.nextInt();
        System.out.print("Numero 2: ");
        num2 = leer.nextInt();

        cociente = num1 / num2;
        residuo = num1 % num2;
        System.out.println(" ");
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);


    }
}
