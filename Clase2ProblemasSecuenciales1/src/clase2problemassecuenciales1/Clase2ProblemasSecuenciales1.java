/*1) Implementar un algoritmo que permita sumar dos números enteros 
ingresados por teclado y muestre el resultado por pantalla.  
 */
package clase2problemassecuenciales1;
import java.util.Scanner;//importo la llibreria Scanner que me permite tomar datos por teclado 

public class Clase2ProblemasSecuenciales1 {
    
    public static void main(String[] args) {
        
        //Cuerpo del Main o punto de inicio de ejecucion de nuetra app 
        //definimos nuestras variables de trabajo 
        int numero1 = 2 , numero2 = 0 , resultado = 0 ;
        Scanner teclado = new Scanner(System.in);            
        
        //solicitamos los datos al usuario 
        System.out.println("Ingrese por favor el numero 1");
        //capturamos el valor ingresado por el usuario 
        numero1 = teclado.nextInt();
        //solicitamos los datos al usuario 
        System.out.println("Ingrese por favor el numero 2");
        //capturamos el valor ingresado por el usuario 
        numero2 = teclado.nextInt();
        
        //procesamos la infromacion 
        resultado = numero1 + numero2 ;
        
        //mostramos los resultados ppor pantalla
        System.out.println("La Suma de " + numero1 + " + " + numero2 + " = " + resultado);    
                
    }    
}
