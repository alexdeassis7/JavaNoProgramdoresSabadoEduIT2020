/*2) Desarrollar un algoritmo que permita determinar si un número
ingresado por teclado es par o impar.  
 */
package clase2condicionaldoble;
import java.util.Scanner;
public class Clase2CondicionalDoble {
    
    public static void main(String[] args) {
        //definimos las variables de trabajo 
        int numeroIngresado = 0 ;
        Scanner teclado = new Scanner(System.in);
        //solicitamos datos al user 
        System.out.println("Ingrese por favor el numero");
        numeroIngresado = teclado.nextInt();
        //Ejemplo condicional Doble 
        if(numeroIngresado % 2 == 0)
            //sentencia a ejecutar si la condicion es true 
            System.out.println("El numero es par");
        else
            //sentencia a ejecutar si la condicion es False 
            System.out.println("El numero es Impar");
        
        System.out.println("Fin del programa");
        
        
        
    }
    
}
