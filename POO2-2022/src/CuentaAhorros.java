public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void depositar(double cantidad) {
        // TODO Auto-generated method stub
        if(cantidad <= 0 ){
            System.out.println("Ingrese una cantidad mayor a 0");
        }else{
            this.saldo += cantidad;
        } 
    }

    @Override
    public void retirar(double cantidad) {
        // TODO Auto-generated method stub
       saldo -= cantidad;
       if(saldo < 0){
            System.out.println("La cantidad para retirar no esta disponible");
       }
    }

    @Override
    public double consultarSaldo(double saldo) {
        // TODO Auto-generated method stub
        return saldo;
    }
 
}
