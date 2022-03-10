import javax.security.auth.login.AccountException;

public class Cuenta{
    private int numCuenta;
    private Cliente cliente;
    private char tipoCuenta;
    private double saldo;


    public Cuenta(int numCuenta, Cliente cliente, char tipoCuenta, double saldo) {
        this.setNumCuenta(numCuenta);
        this.setCliente(cliente);
        this.setTipoCuenta(tipoCuenta);
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public char getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(char tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void deposito(double cantida) throws AccountException{
        if(cantida <= 0){
            throw new AccountException("La cantidad a depositar no esta permitida");
        }else{
            saldo += cantida;
        }

    }

    public void retirar(double cantidad) throws AccountException{
        if(cantidad <=0){
            throw new AccountException("La cantidad a retirar no esta permitida");
        }else
            if((saldo - cantidad) < 0 ){
                throw new AccountException("La cantidad a retirar no esta permitida");
            }else{
                saldo -= cantidad;
        }
    }
}