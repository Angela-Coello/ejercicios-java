package ejemplosFunciones;

public class Ejemplo1 {
    public static void main(String[] args){
      sumar(10, 40);
      saludar( "Angela" , 43);
    }

    static  void sumar(int a, int b){
        int suma = a + b;
        System.out.println("la suma es: " + suma);
    }
    static void saludar(String nombre , int edad){
        System.out.printf("hola %s tu edad es %d \n", nombre, edad);
    }
}
