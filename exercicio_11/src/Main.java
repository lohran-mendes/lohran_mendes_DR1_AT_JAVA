import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numerosSorteados = new int[6];
        int[] numerosInseridos = new int[6];
        int numeroEscolhido;
            boolean valorInvalido;

        Scanner sc = new Scanner(System.in);



        System.out.println("\nBem vindo a simulação da loteria, você deve escolher 6 números diferentes de 1 a 60!");
        for (int i = 0; i < numerosInseridos.length; i++) {

            do {
                System.out.println("Insira o " + (i + 1) + "º número: ");
                valorInvalido = false;
                numeroEscolhido = sc.nextInt();

                if (numeroEscolhido < 1 || numeroEscolhido > 60) {
                    System.out.println("\nO número escolhido deve estar entre 1 e 60!");
                    valorInvalido = true;
                } else {
                    for (int j = 0; j < i; j++) {
                        if (numeroEscolhido == numerosInseridos[j]) {
                            System.out.println("\nVocê não pode escolher números repetidos!");
                            valorInvalido = true;
                            break;
                        }
                    }
                }
            } while (valorInvalido);

            numerosInseridos[i] = numeroEscolhido;
        }

        gerarNumerosAleatorios(numerosSorteados);
        System.out.println();
        System.out.println("Lista de números sorteados: " + mostrarLista(numerosSorteados));
        System.out.println("Lista dos números escolhidos: "+ mostrarLista(numerosInseridos));
        System.out.println(verificaAcertos(numerosSorteados, numerosInseridos));

    }

    static void gerarNumerosAleatorios(int[] listaDeNumerosAleatorios) {
        int numeroGerado;
        boolean valorRepetido;

        for (int i = 0; i < listaDeNumerosAleatorios.length; i++) {

            do {
                numeroGerado = (int) ((Math.random() * 60) + 1);
                valorRepetido = false;

                for (int j = 0; j < i; j++) {
                    if (listaDeNumerosAleatorios[j] == numeroGerado) {
                        valorRepetido = true;
                        break;
                    }
                }
            } while (valorRepetido);

            listaDeNumerosAleatorios[i] = numeroGerado;
        }
    }

    static String mostrarLista(int[] listaDeNumerosAleatorios) {
        StringBuilder lista = new StringBuilder();
        for (int numero : listaDeNumerosAleatorios) {
            lista.append(numero).append(" ");
        }
        return lista.toString();
    }

    static String verificaAcertos(int[] listaSorteada, int[] listaEscolhida){
        int quantidadeDeAcertos = 0;

        for(int numeroSorteado : listaSorteada){
            for(int numeroEscolhido : listaEscolhida){
                if(numeroSorteado == numeroEscolhido){
                    quantidadeDeAcertos++;
                    break;
                }
            }
        }

        if(quantidadeDeAcertos == 0){
            return "Infelizmente você não teve nenhum acerto. :C";
        } else {

        return "Você conseguiu " + quantidadeDeAcertos + " acerto"+ (quantidadeDeAcertos > 1 ? "s" : "") + "!";
        }

    }


}