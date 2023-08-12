package org.example;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Ejer11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nuI;
        int nuF;

        int cantidad = 0;
        System.out.println("numero: ");
        nuI = leer.nextInt();

        System.out.println(" numero final: ");
        nuF = leer.nextInt();

        for (int i = nuI; i <= nuF; i++) {

            cantidad += 1;

        }
        System.out.println("Cantidad: " + cantidad);
    }
}
