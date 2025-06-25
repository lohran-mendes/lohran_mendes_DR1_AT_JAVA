import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumberFormat moedaBR = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("PT-br"));
        Scanner sc = new Scanner(System.in);
        String nome;
        double valorDoEmprestimo;
        int quantidadeDeParcelas;


        System.out.println("Qual o nome do cliente?");
        nome = sc.nextLine();
        System.out.println("Qual o valor do empréstimo?");
        valorDoEmprestimo = sc.nextDouble();
        do {
            System.out.println("Insira a quantidade de parcelas:");
            quantidadeDeParcelas = sc.nextInt();
            if (quantidadeDeParcelas < 6 || quantidadeDeParcelas > 48) {
                System.out.println("\nEssa quantidade de parcelas não é permitida.");
                System.out.println("O minimo seria 6 e o máximo é 48, tente novamente!\n");
            }
        } while (quantidadeDeParcelas < 6 || quantidadeDeParcelas > 48);

        String valorDoEmprestimoFormatado = moedaBR.format(valorDoEmprestimo);
        String pagamentoMensalFormatado = moedaBR.format(calculoDeJurosMensal(valorDoEmprestimo, quantidadeDeParcelas));
        String pagamentoTotalFormatado = moedaBR.format(calculoDeJurosTotal(valorDoEmprestimo));


        System.out.println("\nNome do cliente: " + nome + ".");
        System.out.println("Valor emprestado: " + valorDoEmprestimoFormatado + ".");
        System.out.println("Quantidade total de parcelas: " + quantidadeDeParcelas + ".");
        System.out.println("Valor a ser pago mensalmente: " + pagamentoMensalFormatado + ".");
        System.out.println("O valor total a ser pago referente ao empréstimo é de " + pagamentoTotalFormatado + ".");
    }

    static double calculoDeJurosTotal(double valorEmprestado) {
        return valorEmprestado * 1.03;
    }

    static double calculoDeJurosMensal(double valorEmprestado, int quantidadeDeParcelas) {
        return (valorEmprestado / quantidadeDeParcelas) * 1.03;
    }
}