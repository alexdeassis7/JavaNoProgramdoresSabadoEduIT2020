/*8)Simular el comportamiento de un reloj digital, imprimiendo la hora,
minutos y segundos de un día desde las 0:00:00 hasta las 23:59:59*/
package clase4ejercicio8extrafor;

public class Clase4Ejercicio8ExtraFor {

    public static void main(String[] args) {

        for (int hs = 0; hs <= 23; hs++) {//for que itera las horas 
            for (int min = 0; min <= 59; min++) {//for que itera los minutos 
                for (int seg = 0; seg <= 59; seg++) {//for que itera los minutos 
                    System.out.println(hs + ":" + min + ":" + seg);
                }
            }
        }

    }

}
