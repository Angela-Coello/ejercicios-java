package org.example;
import java.util.Scanner;
public class Ejer6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese un numero : ");

        int letra = 0 ;
        letra = leer.nextInt();
        switch (letra){
            case 0:
                System.out.println("cero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
        }

    }
}
