
package clase3ejemplopractico;
import java.util.Scanner;
public class Clase3Ejemplopractico { 
    public static void main(String[] args) {               
        Scanner teclado = new Scanner(System.in);
        int opcionIngresada = 0 ;
        do{
            System.out.println("Ingrese un opcion por favor ");
            System.out.println("1 .SUMAR \n 2. RESTAR \n 3.DIVIDIR");
            opcionIngresada =teclado.nextInt();
        }while(opcionIngresada < 1 | opcionIngresada > 3);        
        System.out.println("La opcion " + opcionIngresada + "es valida");        
    }    
}
