/*1) Implementar un algoritmo que calcule y muestre por pantalla
el valor final de la compra de un artículo. El algoritmo debe permitir 
el ingreso del precio del artículo y la cantidad de artículos. 
Si el subtotal es superior a $1000, entonces se debe aplicar un descuento del 10% */
package clase2condicionalsimple;
import java.util.Scanner;
public class Clase2CondicionalSimple {
    public static void main(String[] args) {
        //Defino mis variables de trabajo 
        int cantidad = 0;
        float precio = 0, descuento = 0, subtotal = 0, totalCompra = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos datos al user
        System.out.println("Calculo de la compra de un articulo");
        System.out.println("ingrese el precio del articulo");
        precio = teclado.nextFloat();
        System.out.println("ingrese la cantidad de articulos a comprar");
        cantidad = teclado.nextInt();
        //procesamos la informacion 
        subtotal = precio * cantidad;
        //Condicional simple 
        if (subtotal > 1000) {
            //cuerpo del if 
            //sentencias a ejcutar si la condicion es true 
            descuento = subtotal * 0.10f;
        }
        totalCompra = subtotal - descuento;
        if (descuento > 0) 
            System.out.println("Se Aplico Un Descuento de $" + descuento);        
        System.out.println("El Valor Final de la compra es : " + totalCompra);

    }

}
