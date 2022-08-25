package Banco;

public final class Caja {
    private static float dineroDisponible = 1000000;

    public void depositar(Cliente cliente, float monto) {
        dineroDisponible = dineroDisponible + monto;
        cliente.setSaldo(cliente.getSaldo() + monto);
        System.out.println("Se depositó con éxito.");
    }

    public void extraer(Cliente cliente, float monto) {
        if (cliente.getSaldo() < monto) {
            System.out.println("La cuenta no tiene suficiente dinero.");
        } else {
            dineroDisponible = dineroDisponible - monto;
            cliente.setSaldo(cliente.getSaldo() - monto);
            System.out.println("La operación se realizó con éxito.");
        }
    }

    public float getDineroDisponible() {
        return dineroDisponible;
    }
}
