/*2)Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento uno
del vector A con el elemento uno del vector B y así sucesivamente hasta 45, 
almacenar el resultado en un vector C, e imprimir el vector resultante por pantalla. */
package clase4ejercicioextras2;
public class Clase4EjercicioExtras2 {
    public static void main(String[] args) {
        int tamanioVectores = 45;
        //Defino e inicializo los vectores A , B y C .\
        int[] vectorA = new int[tamanioVectores];
        int[] vectorB = new int[tamanioVectores];
        int[] vectorC = new int[tamanioVectores];
        //Cargamos el vector A y B de manera aleatoria 
        for (int i = 0; i < tamanioVectores; i++) {
            vectorA[i] = (int) (Math.random() * 100) + 1;
            vectorB[i] = (int) (Math.random() * 100) + 1;
        }
        //mostramos los vectores Cargados 
        System.out.println("VECTOR A");
        for (int i = 0; i < tamanioVectores; i++) {
            System.out.print(vectorA[i] + " - ");
        }
        System.out.println("\nVECTOR B");
        for (int i = 0; i < tamanioVectores; i++) {
            System.out.print(vectorB[i] + " - ");
        }
        //Cargamos en Vector C , con la suma de A y B
        for (int i = 0; i < tamanioVectores; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        //Mostramos el vector resultante de las sumas ( VectorC) 
        System.out.println("\n VECTOR C ");
        for (int i = 0; i < tamanioVectores; i++) {
            System.out.print(vectorC[i] + " - ");
        }
    }

}
