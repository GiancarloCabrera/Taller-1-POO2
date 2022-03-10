public abstract class Cuenta {
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;


    public Cuenta(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // Le corresponde a la clase hija implementar y definir estos metodos
    public abstract void depositar(double cantidad);

    public abstract void retirar(double cantidad);

    public abstract double consultarSaldo(double saldo);

}
