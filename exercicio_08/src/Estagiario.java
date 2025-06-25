public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, (salarioBase - (salarioBase * 0.1)));
    }
}
