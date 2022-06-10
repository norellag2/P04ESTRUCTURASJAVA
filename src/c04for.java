public class c04for {
    public static void main(String[] args) {
        //Ciclos for idem JavaScript
        //Importante la declaracion de variables
        for ( int i=0; i < 5; i++) {
            System.out.println(i);
        }

        //Foreach en Java
        // sintaxis for(tipo variable: colección) {
            // código con esa variable
       // }

       String [] nombres = {"Juan", "Pilar", "Lucía"};
       for (String nombre : nombres) {
           System.out.println("El nombre es " + nombre);
       }
    }
}
