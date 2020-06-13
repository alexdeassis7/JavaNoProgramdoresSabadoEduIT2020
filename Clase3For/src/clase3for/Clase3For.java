package clase3for;

public class Clase3For {

    public static void main(String[] args) {
        System.out.println("mostramos los numeros pares con un FOR");
        System.out.println("Inicio del For");
        
        for (int i = 0; i <= 100; i += 2) {
            //Cuerpo del for 
            System.out.println("i = " + i);
        }

        System.out.println("Fin del For");

        for (int j = 100; j >= 0; j -= 2) {
            //Cuerpo del for 
            System.out.println("j = " + j);
        }
        
        System.out.println("Fin de la App");

    }

}
