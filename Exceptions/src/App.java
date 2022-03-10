public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Cliente cliente = new Cliente(10911, "Alberto", "Salazar", "nometes@gmail.com", 3232243211L);
        Cuenta cuenta = new Cuenta(123, cliente, 'A', 1000000);

        try {
            cuenta.deposito(-100000);
        }catch(Exception s){
            System.out.println("Error" + s.getMessage());
        }
    }
}
