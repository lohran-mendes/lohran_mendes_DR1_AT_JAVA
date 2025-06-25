import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salarioMensal;
        double salarioAnual;

        System.out.println("Insira o seu salário mensal:");

        try {
            salarioMensal = sc.nextDouble();
            salarioAnual = salarioMensal * 12;

            NumberFormat formatoBR = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));
            String salarioMensalFormatado = formatoBR.format(salarioMensal);
            String salarioAnualFormatado = formatoBR.format(salarioAnual);
            double salarioAnualLiquido = (salarioAnual - (salarioAnual * porcentagemDoImposto(salarioAnual)));
            double salarioMensalLiquido = salarioAnualLiquido / 12;

            String salarioMensalLiquidoFormatado = formatoBR.format(salarioMensalLiquido);
            String salarioAnualLiquidoFormatado = formatoBR.format((salarioAnualLiquido));
            String porcentagemDeImposto = String.format("%.1f", (porcentagemDoImposto(salarioAnual) * 100.00)) + "%";

            if (salarioMensal < 0) {
                System.out.println("Não é possível fazer o calculo com um salário negativo.");
            } else if (salarioMensal == 0) {
                System.out.println("Você não terá que pagar imposto porque você não tem uma renda.");
            } else if (porcentagemDoImposto(salarioAnual) == 0) {
                System.out.println("\nO salário de " + salarioMensalFormatado + " por mês é igual a uma renda de " + salarioAnualFormatado + " por ano.");
                System.out.println("A sua faixa salarial tem isenção de imposto.");
            } else {
                System.out.println("\nO salário de " + salarioMensalFormatado + " por mês é igual a uma renda de " + salarioAnualFormatado + " por ano.");
                System.out.println("Você deverá pagar " + porcentagemDeImposto + " de imposto.");
                System.out.println();
                System.out.println("Logo, o seu salário liquido por mês é igual a: " + salarioMensalLiquidoFormatado + " e o quanto você ganha liquido por ano é igual a: " + salarioAnualLiquidoFormatado + ".");
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida, só é aceito valores numéricos na entrada de salário.");
        }
        
        sc.close();
    }

    static double porcentagemDoImposto(double salarioAnual) {
        if (salarioAnual <= 22847.76) {
            return 0;
        } else if (salarioAnual <= 33919.80) {
            return 0.075;
        } else if (salarioAnual <= 45012.61) {
            return 0.15;
        } else {
            return 0.275;
        }
    }
}