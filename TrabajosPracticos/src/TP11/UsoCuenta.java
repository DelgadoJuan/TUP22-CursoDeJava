package TP11;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Juan", 1000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Gio", 500);

        System.out.println(cuenta1.toString() + "\n" + cuenta2.toString());

        cuenta1.transferencia(cuenta2, 250);
        System.out.println("La cuenta de " + cuenta1.getNombreTitular() + " posee $" + cuenta1.getSaldo());
        System.out.println("La cuenta de " + cuenta2.getNombreTitular() + " posee $" + cuenta2.getSaldo());
    }
}
