public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, (salarioBase + (salarioBase * 0.2)));
    }
}
