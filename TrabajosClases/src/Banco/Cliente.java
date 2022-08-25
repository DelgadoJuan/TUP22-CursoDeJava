package Banco;

public class Cliente {
    private int nroCliente;
    private String nombre;
    private float saldo;

    public Cliente(int nroCliente, String nombre) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.saldo = 0;
    }

    public Cliente(int nroCliente, String nombre, float saldo) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nroCliente=" + nroCliente +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
