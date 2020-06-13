package clase3estructurasrepetitivas;

public class Clase3EstructurasRepetitivas {
    public static void main(String[] args) {
        //WHILE - DO WHILE - FOR
        System.out.println("inicio app");
        int contador = 0;
        while (contador < 10) { // OJO : con el LOOP INFINITO
            //seccion de codigo que se va a repetir 
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
//            contador = contador + 1 ;
//            contador += 1 ;            
            contador++;
            System.out.println("el contador vale :" + contador);
        }
        System.out.println("Fin app");
    }
}
