package TP11;

public class CuentaCorriente {
    private long numeroCuenta;
    private String nombreTitular;
    private float saldo;

    public CuentaCorriente(String nombreTitular, float saldo) {
        this.numeroCuenta = (long)(Math.random()*1000+1);
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void transferencia(CuentaCorriente cuentaCorriente, float monto) {
        if (monto > this.saldo) {
            System.out.println("La cuenta no tiene dinero suficiente.");
        } else {
            cuentaCorriente.setSaldo(cuentaCorriente.getSaldo() + monto);
            this.saldo -= monto;
            System.out.println("La transferencia se realizó con éxito.");
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta=" + numeroCuenta +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
