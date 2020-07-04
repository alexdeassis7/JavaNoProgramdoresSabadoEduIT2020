package clase5subalgoritmos;
import java.util.Scanner;
public class Clase5SubAlgoritmos {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = 0 ;
        
        System.out.println("Invocacion al procedimiento Ejecutar()");
        //INVOCAMOS AL PROCEDIMIENTO EJECUTAR()
        ejecutar();
        System.out.println("Ingrese el valor del producto");
        valor =  teclado.nextInt();
        //invocamos a la funcion iva enviandole un parametro de tipo int         
        System.out.println("El iva del producto es :" + iva(valor));                
        System.out.println("Fin de mi app");
    }
    //Definimos un procedimiento llamado ejecutar 
    //que muestra por tantalla los numeros del cero al nuevo 
    public static void ejecutar() {
        //cuerpo del metodo PROCEDIMIENTO 
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    //Definimos una funcion llamada iva la cual recibe un parametro de tipo int y
    //retorna un double 
    public static double iva(int valor ) {
        //cuerpo de la funcion 
        double porcentaje = 0.21;
        double resultado = valor * porcentaje;
        return resultado;
    }

}
