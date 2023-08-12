package org.example;
import java.util.Scanner;
public class Ejer5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese un numero : ");

        int estacion= 0;
        estacion = leer.nextInt();
        switch (estacion) {
            case 1:
                System.out.println("verano");
                break;

            case 2:
                System.out.println("Otoño");
                break;

            case 3:
                System.out.println("invierno");
                break;

            case 4:
                System.out.println("primavera");
                break;

        }


    }
}

