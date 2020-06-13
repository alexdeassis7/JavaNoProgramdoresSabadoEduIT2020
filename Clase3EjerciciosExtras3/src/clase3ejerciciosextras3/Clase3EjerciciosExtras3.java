/* 3)	Leer 10 números e imprimir solamente los positivos */
package clase3ejerciciosextras3;

import java.util.Scanner;

public class Clase3EjerciciosExtras3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            numeroIngresado = teclado.nextInt();
            if(numeroIngresado > 0){
                System.out.println(numeroIngresado + " ES POSITIVO");
            } 
        }
    }
}
