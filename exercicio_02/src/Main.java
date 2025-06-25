import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        String senha;

        do {
            System.out.println("\nQual o seu nome?");
            nome = sc.nextLine().trim();
        } while (!validaNome(nome));

        do {
            System.out.println("\nQual a sua senha?");
            senha = sc.nextLine().trim();
        } while (!validaSenha(senha));

        System.out.println("\nParabéns " + nome + " a sua senha é válida!");
        sc.close();
    }


    static boolean validaSenha(String senha) {
        if (!verificaQuantidadeDeLetras(senha)) {
            System.out.println("A senha precisa de pelo menos 8 caracteres!");
            return false;
        } else if (!verificaLetraMaiuscula(senha)) {
            System.out.println("A senha precisa ter pelo menos uma letra maiúscula!");
            return false;
        } else if (!verificaSeHaNumero(senha)) {
            System.out.println("A senha precisa ter pelo menos um número!");
            return false;
        } else if (!verificaSeHaCaracterEspecial(senha)) {
            System.out.println("A senha precisa ter pelo menos um caractere especial!");
            return false;
        } else {
            return true;
        }
    }

    static boolean validaNome(String nome) {
        if (nome.isBlank()) {
            System.out.println("O nome não pode ser vazio ou nulo!");
            return false;
        }
        return true;
    }

    static boolean verificaQuantidadeDeLetras(String senha) {
        int quantidadeDeLetras = senha.length();
        return quantidadeDeLetras >= 8;
    }

    static boolean verificaLetraMaiuscula(String senha) {
        return senha.matches(".*[A-Z].*");
    }

    static boolean verificaSeHaNumero(String senha) {
        return senha.matches(".*[0-9].*");
    }

    static boolean verificaSeHaCaracterEspecial(String senha) {
        return senha.matches(".*[^a-zA-Z0-9].*");
    }
}