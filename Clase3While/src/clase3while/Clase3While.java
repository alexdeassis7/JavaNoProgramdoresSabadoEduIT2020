/*1)	Calcular el promedio de un alumno que tiene 7 
calificaciones en la materia de Diseño Estructurado de Algoritmos.
y mostrar el promedio por pantalla */
package clase3while;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Clase3While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float notaingresada = 0, promedio = 0, acumulador = 0;
        int contador = 0;

        while (contador < 7) {
            System.out.println("ingrese la nota " + (contador + 1));
            notaingresada = teclado.nextFloat();
            acumulador += notaingresada;
            contador++;
        }
        
        DecimalFormat formato1 =  new DecimalFormat("#.00");
        //calculo del promedio 
        promedio = acumulador / 7;
        System.out.println(formato1.format(promedio));
        System.out.printf("Promedio = %.3f \n" , promedio);        
         System.out.printf("Value of Float  up-to 2 decimals : %.2f", promedio);

    }

}
