package org.example;
import java.util.Scanner;
public class Ejer8 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int i;
        int num;
        int suma = 0;
        i = 1;
        System.out.print("numero : ");
        num = leer.nextInt();

        while (i <= num){
            suma = suma + i;
            i++;
        }
        System.out.println("");
        System.out.println("suma: " + suma);
    }
}
