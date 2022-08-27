package TP08;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del cual desea saber la raíz cuadrada: ");
        int numero = scanner.nextInt();

        System.out.println("La raíz de " + numero + " es = " + Math.sqrt(numero));
    }
}
