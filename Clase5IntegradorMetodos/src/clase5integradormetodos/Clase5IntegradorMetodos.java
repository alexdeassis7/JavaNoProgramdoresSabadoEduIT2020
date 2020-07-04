/*Realizar una calculadora que permita realizar las cuatro operaciones aritmeticas basicas
sumas , restas , multiplicacion y division  */
package clase5integradormetodos;

import javax.swing.JOptionPane;

public class Clase5IntegradorMetodos {

    //Atributos de la clase (Variable Global)
    public static int num1 = 0, num2 = 0;

    public static void main(String[] args) {
        int opcionIngresada = 0;
        do {
            opcionIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n 1-SUMAR \n 2-RESTAR \n 3-MULTIPLICAR \n 4-DIVIDIR "));
        } while (opcionIngresada < 1 || opcionIngresada > 4);
        
        if( (opcionIngresada == 1 || opcionIngresada == 2 ) || opcionIngresada == 3 ){
        solicitarNumeros();//invocamos al procedimiento que solicita los numeros al usuario 
        }
        
        switch (opcionIngresada) {
            case 1:
                mostrarMensaje("Usted Selecciono la opcion SUMA");
                mostrarResultado(suma(num1, num2) ,"SUMA");                
                break;
            case 2:
                mostrarMensaje("Usted Selecciono la opcion RESTA");
                mostrarResultado(resta(num1, num2) ,"RESTA");   
                break;
            case 3:
                mostrarMensaje("Usted Selecciono la opcion MULTIPLICAR");
                mostrarResultado(multiplica(num1, num2) ,"MULTIPLICACION");   
                break;
            case 4:
                mostrarMensaje("Usted Selecciono la opcion DIVIDIR");
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero uno"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero dos"));
                if(num2 != 0)
                    mostrarResultado( divide(num1, num2) , "Division");
                else
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero en los numeros reales");
                break;
            default:
                System.out.println("La opcion ingresada es invalida ");
        }

    }

    public static void mostrarResultado(int resultado, String opAritmetica) {
        JOptionPane.showMessageDialog(null, "El resultado de la " + opAritmetica + " es : " + resultado);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void solicitarNumeros() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero uno"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero dos "));
    }

    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    
    public static int resta(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    
    public static int multiplica(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }
    
     public static int divide(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }

}
