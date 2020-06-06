/*1)	Leer dos números: si son iguales que los multiplique,
si el primero es mayor que el segundo que los reste y si no que los sume.*/
package clase2ejercitacionextra1compuestos;

import java.util.Scanner;

public class Clase2ejercitacionExtra1compuestos {
    public static void main(String[] args) {
        //defino mis variables de trabajo 
        int num1 = 0 , num2 = 0 ,resultado = 0; 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese el numero 1");
        num1 =teclado.nextInt();
        System.out.println("ingrese el numero 2");
        num2 = teclado.nextInt();
        //If -Else ANIDADOS!
        if(num1 == num2){//si son iguales que los multiplique
            resultado = num1 * num2 ;
        }else if(num1 > num2){//si el primero es mayor que el segundo que los reste 
            resultado = num1 - num2 ;
        }else{  //si no que los sume
            resultado = num1 + num2 ;
        }        
        System.out.println("El resultado es : " + resultado);
       
    }
    
}
