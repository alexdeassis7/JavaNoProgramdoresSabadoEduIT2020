/*Calcular La Temperatura Promedio del mes de Agosto  */
package clase4arraysdemo;
import java.util.Scanner;
public class Clase4ArraysDemo {
    public static void main(String[] args) {
         int cantidadDeDias = 31 ;
        //definimos e inicializo el array que contendra las temperaturas del mes de agosto 
        float[] temperatura_de_agosto = new float[cantidadDeDias];
        float promedio = 0 , acumulador = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo de promedio temperaturas maximas de agosto ");
       // System.out.println("temperatura_de_agosto.length : " + temperatura_de_agosto.length );
        //utilizamos un for para cargar el array 
        for (int indice = 0; indice < temperatura_de_agosto.length ; indice++ ) {
            System.out.println("Ingrese la temperatura maxima del dia " + (indice + 1) + " de Agosto");
            temperatura_de_agosto[indice] = teclado.nextFloat();
            acumulador += temperatura_de_agosto[indice]; //acumulamos todas las temperaturas en una variable 
        }
        promedio = acumulador / temperatura_de_agosto.length ;
        //mostramos el contenido del array 
        for (int i = 0; i < temperatura_de_agosto.length ; i++) {
            System.out.print(temperatura_de_agosto[i] + " - ");
        } 
        System.out.println("\n El promedio de los " + cantidadDeDias + " dias de agosto es " + promedio);
        //OJO no desbordar el indice de nuestro array !!!
        //System.out.println("temperatura_de_agosto[25]" + temperatura_de_agosto[25]);
        
        

    }

}
