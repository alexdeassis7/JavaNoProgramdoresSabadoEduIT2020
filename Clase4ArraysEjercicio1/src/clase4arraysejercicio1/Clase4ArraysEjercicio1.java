/*1)	Calcular el promedio de 50 valores almacenados en un Vector. 
Determinar además cuantos son mayores que el promedio, imprimir el promedio,
y una lista de valores mayores que el promedio . */
package clase4arraysejercicio1;

public class Clase4ArraysEjercicio1 {

    public static void main(String[] args) {
        //definimos e inicilizamos el vector de 50 elementos  
        float[] arrayDeValores = new float[10];
        float[] arrayDeValoresMayoresAlPromedio ;//definimos el array      
        float promedio = 0, acumulador = 0;
        int contadorDeMayoresAlPromedio = 0;
     
        //cargamos el vector con elementos numericos        
        for (int i = 0; i < arrayDeValores.length; i++) {
            arrayDeValores[i] = (int) ((Math.random() * 10) + 1);
            acumulador += arrayDeValores[i];//acumulamos todos los valores del array en una variable  
        }
        //calculamos el promedio de todos los valores del array 
        promedio = acumulador / arrayDeValores.length;
        //Determinamos cuantos valores son mayores al promedio 
        for (int i = 0; i < arrayDeValores.length; i++) {
            if (arrayDeValores[i] > promedio) {    
                contadorDeMayoresAlPromedio++;
            }
        }
        arrayDeValoresMayoresAlPromedio = new float[contadorDeMayoresAlPromedio];
        int j = 0;
        //generamos la  lista de valores mayores que el promedio .
        for (int i = 0; i < arrayDeValores.length; i++) {
            if(arrayDeValores[i] > promedio){
                arrayDeValoresMayoresAlPromedio[j] = arrayDeValores[i];
                j++;
            }
        } 
        //mostramos el vector que cargamos con numero aleatorios 
        System.out.println("Array de valores generados de forma aleatoria ");
        for (int i = 0; i < arrayDeValores.length; i++) {
            System.out.print( arrayDeValores[i] + " - ");
        }
        //mostramos  lista de valores mayores que el promedio .
        System.out.println("\nArray de valores mayores al promedio ");
        for (int i = 0; i < arrayDeValoresMayoresAlPromedio.length; i++) {
            System.out.print(arrayDeValoresMayoresAlPromedio[i] + " - " );
        }
        System.out.println("\nEl promedio es :" + promedio);
        System.out.println("Existen " + contadorDeMayoresAlPromedio + " valores mayores a " + promedio);

    }

}
