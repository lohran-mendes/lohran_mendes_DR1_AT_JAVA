import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String caminhoArquivo = "exercicio_10/compras.txt";
        String compras = "";

        System.out.println("Cadastre 3 compras:");
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nDigite o produto da " + i + "ª compra:");
            String nome = sc.nextLine();

            System.out.println("Digite a quantidade da " + i + "ª compra:");
            int quantidade = sc.nextInt();

            System.out.println("Digite o preço da " + i + "ª compra:");
            double preco = sc.nextDouble();

            compras += "Produto: " + nome + " | Quantidade: " + quantidade + " | R$" + String.format("%.2f", preco) + "\n";

        }
        salvarArquivo(caminhoArquivo, compras);
        lerArquivo(caminhoArquivo);
    }

    static void salvarArquivo(String caminhoArquivo, String compra) {
        try (PrintWriter pw = new PrintWriter(caminhoArquivo)) {
            pw.println(compra);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    static void lerArquivo(String caminhoArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            System.out.println("\nCompras registradas no arquivo: " + caminhoArquivo + ":");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
