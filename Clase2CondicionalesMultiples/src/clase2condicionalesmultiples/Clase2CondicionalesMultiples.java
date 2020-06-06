/*Crear un programa que permita realizar suma , resta , multiplicaion 
de dos numeros dependiendo la opcion elegida por el usuario  */
package clase2condicionalesmultiples;

import java.util.Scanner;

public class Clase2CondicionalesMultiples {

    public static void main(String[] args) {
        //defino las variables de trabajo 
        int opcionIngresada = 0;
        int resultado = 0 , num1 = 0 , num2 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Ingrese la operacion que desea realizar ");
        System.out.print(" 1.SUMAR \n 2.RESTAR \n 3.MULTIPLICAR ");
        opcionIngresada = teclado.nextInt();
        
        if(opcionIngresada > 0 & opcionIngresada < 4){
            System.out.println("ingrese numero 1");
            num1 = teclado.nextInt();
            System.out.println("ingrese numero 2");
            num2 = teclado.nextInt();
        }
        
        //EJEMPLO CONDICIONAL MULTIPLE
        switch (opcionIngresada) {
            case 1:
                //sentencia a ejecutar si la variable "opcion ingresada vale 1"
                System.out.println("usted selecciono la opcion de SUMAR");
                resultado = num1 + num2;
                break;
            case 2:
                //sentencia a ejecutar si la variable "opcion ingresada vale 1"
                System.out.println("usted selecciono la opcion de RESTAR");
                resultado = num1 - num2;
                break;
            case 3:
                //sentencia a ejecutar si la variable "opcion ingresada vale 1"
                System.out.println("usted selecciono la opcion de MULTIPLICAR");
                resultado = num1 * num2;
                break;
            default:
                System.out.println("La opcion " + opcionIngresada + " no es valida ");
                
        }
        
        if(opcionIngresada > 0 & opcionIngresada < 4){
            System.out.println("El resultado es  : " + resultado );
        }
        
        

    }

}
