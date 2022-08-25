package Banco;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1, "Juan", 1000);
        Caja caja = new Caja();

        caja.extraer(c1, 5);
        System.out.println("El monto total de la caja es: $" + caja.getDineroDisponible());
        System.out.println("El saldo del cliente " + c1.getNroCliente() + " es: $" + c1.getSaldo());

        Cliente[] clientes = {
                c1,
                new Cliente(2, "Gio", 200),
                new Cliente(3, "Jorge", 5000),
                new Cliente(4, "Ronaldinho", 5000000)
        };

        Banco banco = new Banco(clientes);
        System.out.println(banco.toString());

        caja.depositar(clientes[1], 600);
        System.out.println("El monto total de la caja es: $" + caja.getDineroDisponible());
        System.out.println("El saldo del cliente " + clientes[1].getNroCliente() + " es: $" + clientes[1].getSaldo());
    }
}
