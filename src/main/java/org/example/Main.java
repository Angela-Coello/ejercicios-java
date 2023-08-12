package org.example;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

    int numero1;
    int numero2;
    int suma;
    int resta;
     Scanner leer = new Scanner(System.in);

     System.out.print("Numero 1: ");
     numero1 = leer.nextInt();
     System.out.print("Numero 2: ");
     numero2 = leer.nextInt();

     suma = numero1 + numero2 ;
     resta = numero1 - numero2;

    System.out.println(" ");
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);

    }
}