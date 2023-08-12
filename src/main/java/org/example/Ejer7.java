package org.example;
import java.util.Scanner;
public class Ejer7 {
    public static void main(String[] args){
        int num1;
        int num2;
        int resultado = 0;
        char operador;

        Scanner leer = new Scanner(System.in);
        System.out.print("operador: ");
        operador = leer.next().charAt(0);

    System.out.print("numero 1: ");
    num1 = leer.nextInt();

    System.out.print("numero 2: ");
     num2 = leer.nextInt();

     switch (operador){
         case '+':
             resultado = num1 + num2;
             break;
         case '-':
             resultado = num1 - num2;
             break;
         case '*':
             resultado = num1 * num2;
             break;
         case '/':
             resultado = num1 / num2;

     }

System.out.println("resultado: " + resultado);

}
}
