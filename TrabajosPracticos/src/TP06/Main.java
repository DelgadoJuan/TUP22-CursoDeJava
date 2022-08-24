package TP06;

public class Main {
    public static void main(String[] args) {
        double angulo = Math.toRadians(60);
        double sen = Math.sin(angulo);
        double cos = Math.cos(angulo);
        double tang = Math.tan(angulo);
        double arcotan = Math.toDegrees(Math.atan(tang));
        double pi = Math.PI;
        double e = Math.E;

        double x = 90.0;
        double y = 15.0;
        double theta = Math.atan2(y, x);

        System.out.println("El seno de 60° es: " + sen);
        System.out.println("El coseno de 60° es: " + cos);
        System.out.println("La tangente de 60° es: " + tang);
        System.out.println("La arcotangente es: " + arcotan);
        System.out.println("Atan2 es: " + theta);
        System.out.println("El numero pi es igual a: " + pi);
        System.out.println("El numero de Euler es igual a: " + e);
        System.out.println("La función exponencial de 2 es: " + Math.exp(2));
        System.out.println("La función logarítmica de 2 es: " + Math.log(2));
    }
}
