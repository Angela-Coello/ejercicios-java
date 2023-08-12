package ejemplosFunciones;

public class EjemString {
    public static void main(String[] args){
        String nombre = "Angelita";
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.length());

        for(int i = 0; i< nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }

        System.out.println(nombre.substring(0, 4));

        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());


        nombre = "A n g e l a";
        System.out.println(nombre.replace("A", "a"));

        System.out.println("Hola".equals("hola") );

        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);

        nuevo.append("Hola ");
        nuevo.append("Mundo");


        System.out.println(nuevo.toString());
    }
}
