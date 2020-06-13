/*2)	Leer 10 números y obtener su cubo y su cuarta */
package clase3ejerciciosextras2;

import java.util.Scanner;

public class Clase3ejerciciosExtras2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numeroIngresado = 0, cubo = 0, cuarta = 0;

        for (int i = 0; i < 10; i++) {
        
            System.out.println("ingrese el numero " + (i + 1) );
            numeroIngresado = teclado.nextInt();
            cubo = numeroIngresado * numeroIngresado * numeroIngresado;
            cuarta = cubo * numeroIngresado;
            System.out.print("cubo = " + cubo + " cuarta  = " + cuarta + " \n");
        
        }
        

    }

}
