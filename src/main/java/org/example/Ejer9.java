package org.example;
import java.util.Scanner;
public class Ejer9 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        int numinicial;
        int numfinal;
         int cantidad = 0;
         int i;

        System.out.println("numero inicial: ");
        numinicial = leer.nextInt();

        System.out.println("numero final: ");
        numfinal = leer.nextInt();


        i = numinicial +1 ;
        while (i <= numfinal){
            cantidad += 1 ;
            i++;

            System.out.println("Cantidad: " + cantidad);
        }
    }
}
