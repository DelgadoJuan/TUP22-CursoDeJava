package TP10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int)(Math.random()*100+1);
        int numero, intentos = 0;
        System.out.println(numeroAleatorio);

        while (true) {
            intentos++;
            System.out.print("Ingrese un número entre 1 y 100: ");
            numero = scanner.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("Correcto! La respuesta era el número " + numeroAleatorio);
                break;
            } else {
                if (numero < numeroAleatorio) {
                    System.out.println("El número a encontrar es mayor.");
                } else {
                    System.out.println("El número a encontrar es menor.");
                }
            }
        }

        System.out.println("Utilizó " + intentos + " intentos para encontrar el número.");
    }
}
