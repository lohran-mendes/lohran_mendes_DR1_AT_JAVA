public class Funcionario {
    String nome;
    double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", salário: R$" + String.format("%.2f", salarioBase);
    }
}
