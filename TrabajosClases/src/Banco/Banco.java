package Banco;

import java.util.Arrays;

public class Banco {
    private Cliente[] clientes;

    public Banco(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "clientes=" + Arrays.toString(clientes) +
                '}';
    }
}
