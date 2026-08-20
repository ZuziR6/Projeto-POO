public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("João", 500.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        System.out.println("\n--- DEPÓSITO VÁLIDO ---");
        conta.depositar(200.00);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- DEPÓSITO INVÁLIDO ---");
        conta.depositar(-100.00);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- SAQUE VÁLIDO ---");
        conta.sacar(150.00);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- SAQUE INVÁLIDO ---");
        conta.sacar(1000.00);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- SAQUE COM ZERO ---");
        conta.sacar(0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
