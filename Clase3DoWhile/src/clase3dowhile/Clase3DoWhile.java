/*mostrar los numeros pares del 0 al 100*/
package clase3dowhile;

import java.util.Scanner;

public class Clase3DoWhile {
 
    public static void main(String[] args) {
        int contador = 0 ;
        System.out.println("Inicio del While");
        while(contador <= 100){
            System.out.println(contador);
            contador += 2;            
        }
        System.out.println("Fin del While");
        contador-=2;
        System.out.println("Inicio del Do-While");
       
        do{
            System.out.println(contador);
            contador -= 2;            
        }while(contador >= 0);
        System.out.println("Fin del Do-While");

        
    }
    
}
