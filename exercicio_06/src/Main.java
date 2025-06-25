public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo();
        carro.placa = "123456";
        carro.modelo = "Gol";
        carro.anoDeFabricacao = 2008;
        carro.quilometragem = 5000;
        carro.registrarViagem(300);
        System.out.println("\nDetalhes do carro:");
        System.out.println(carro.exibirDetalhes());


        Veiculo moto = new Veiculo();
        moto.placa = "654321";
        moto.modelo = "Honda";
        moto.anoDeFabricacao = 2023;
        moto.quilometragem = 200;
        moto.registrarViagem(100);
        System.out.println("\nDetalhes da moto:");
        System.out.println(moto.exibirDetalhes());
    }
}