package org.example;
import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num;
        int resultado;
        resultado = 0;

        System.out.println("numero: ");
        num = leer.nextInt();

        for (int i = 1 ; i <= num ; i ++) {
            resultado += i;

        }
        System.out.println("suma: " + resultado);
    }
}
