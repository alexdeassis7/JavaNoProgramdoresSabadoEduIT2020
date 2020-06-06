/*3) Implementar un algoritmo que permita ingresar las longitudes de un rectángulo
y muestre por pantalla el perímetro y la superficie de la figura.  */
package clase2problemassecuenciales3;
import java.util.Scanner;
public class Clase2ProblemasSecuenciales3 {
    public static void main(String[] args) {
        //defino las variables de trabajo 
        float ladoMenor = 0, ladoMayor = 0, perimetro = 0, superficie = 0;
        Scanner teclado = new Scanner(System.in);
        //solicito datos al user
        System.out.println("Calculo del perimetro y superficie de un rectangulo");
        System.out.println("Ingrese la longitud del lado menor");
        ladoMenor = teclado.nextFloat();
        System.out.println("Ingrese la longitud del lado mayor");
        ladoMayor = teclado.nextFloat();
        //proceso la infomarcion
        perimetro = ladoMenor * 2   + ladoMayor * 2;
        superficie = ladoMenor * ladoMayor;
        //mostramos los resultados 
        System.out.println("El perimetro del rectangulo es :" + perimetro);
        System.out.println("La superficie del rectangulo es :" + superficie);
        
    }

}
