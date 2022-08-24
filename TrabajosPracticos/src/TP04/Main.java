package TP04;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su salario: "));
        boolean carnet = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene carnet? Ingrese true/false: "));

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        if (carnet) {
            System.out.println("Carnet: Si");
        } else {
            System.out.println("Carnet: No");
        }
    }
}
