public class Main {
    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();
        c.titular = "Lohran Mendes";

        System.out.println("\nSaldo inicial:");
        System.out.println(c.exibirSaldo());

        c.depositar(1000);
        System.out.println("\nSaldo após o depósito de 1000 reais:");
        System.out.println(c.exibirSaldo());

        c.sacar(300);
        System.out.println("\nSaldo após o saque de 300 reais:");
        System.out.println(c.exibirSaldo());
    }
}