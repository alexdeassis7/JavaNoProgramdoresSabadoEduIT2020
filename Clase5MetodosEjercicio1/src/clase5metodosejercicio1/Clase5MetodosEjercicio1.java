package clase5metodosejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*Realizar un programa modularizado que permita la suma de dos numeros 
y muestre el resultado por pantalla */
public class Clase5MetodosEjercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1ingresado = 0, num2ingresado = 0;
        System.out.println("Welcome Calculadora de sumas");        
                      
        System.out.println("ingrese el numero uno");
        num1ingresado = teclado.nextFloat();
        
        System.out.println("ingrese el numero dos");
        num2ingresado = teclado.nextFloat();
            //INVOCO A LA FUNCION SUMAR
        System.out.println("El resultado de la suma es :" + sumar(num2ingresado , num1ingresado));

        System.out.println("FIn de la app");
    }

    //definimos una funcion llamada sumar() que recibe dos parametros
    public static float sumar(float num1, float num2) {
        return num1 + num2;
    }

}
