/* 2) Implementar un algoritmo que permita ingresar dos números enteros por 
teclado y luego muestre la suma, resta, multiplicación y división de ambos números. */
package clase2problemassecuenciales2;

import java.util.Scanner;

public class Clase2ProblemasSecuenciales2 {

    public static void main(String[] args) {
        //definimos las variables de trabajo 
        int num1 = 0, num2 = 0, suma = 0, resta = 0, multiplicacion = 0, division = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos al user    
        System.out.println("Algoritmo de operaciones basicas");
        System.out.println("ingrese el primer numero");
        num1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = teclado.nextInt();
        //procesamos la informacion 
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        //mostamos los resultados por pantalla 
        System.out.println("La suma de los numeros es :" + suma);
        System.out.println("La resta de los numeros es :" + resta);
        System.out.println("La multiplicacion de los numeros es :" + multiplicacion);
        System.out.println("La division de los numeros es :" + division);

    }

}
