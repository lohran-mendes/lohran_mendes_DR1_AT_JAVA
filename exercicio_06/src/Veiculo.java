public class Veiculo {
    String placa;
    String modelo;
    int anoDeFabricacao;
    double quilometragem;

    String exibirDetalhes() {
        return "Placa: " + this.placa + "\nModelo: " + this.modelo + "\nAno de Fabricação: " + anoDeFabricacao + "\nQuilometragem: " + this.quilometragem;
    }

    void registrarViagem(double quilometragem) {
        this.quilometragem += quilometragem;
    }
}
