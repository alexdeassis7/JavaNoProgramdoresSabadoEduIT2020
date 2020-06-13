/*4)Leer 20 números e imprimir cuantos son positivos , cuantos negativos y cuantos neutros*/
package clase3ejercicioextras4;

import java.util.Scanner;

public class Clase3EjercicioExtras4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadPositivos = 0, cantidadNegativos = 0, cantidadNeutros = 0, numeroIngresado = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("ingrese el numero " + (i + 1));
            numeroIngresado = teclado.nextInt();

            if (numeroIngresado < 0) {
                cantidadNegativos++;
            } else if (numeroIngresado > 0) {
                cantidadPositivos++;
            } else {
                cantidadNeutros++;
            }
        }
        System.out.println("usted ingreso ");
        System.out.println(cantidadPositivos + " numeros positivos");
        System.out.println(cantidadNegativos + " numeros negativos");
        System.out.println(cantidadNeutros + " numeros neutros");

    }

}
