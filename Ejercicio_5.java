public class Ejercicio_5 {
   //* Java Ejercicios Básicos Resueltos 2

    //*JAVA EJERCICIOS BÁSICOS ESTRUCTURA SECUENCIAL
    //*Actualizado 2020

    //*Relación Nº 2: Ejercicios 4, 5, 6 y 7

    //*Ejercicio 4: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
    //*La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:

            import java.util.*;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double gradosC, gradosF;
            System.out.println("Introduce grados Centígrados:");
            gradosC = sc.nextDouble();
            gradosF = 32 + (9 * gradosC / 5);
            System.out.println(gradosC +" ºC = " + gradosF + " ºF");
        }

    }
}
